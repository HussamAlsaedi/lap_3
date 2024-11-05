import java.util.ArrayList;

public class User {

    private String username;
    private String email;
    private ArrayList<String> purchasedMedialist = new ArrayList<>();
    private final ArrayList<String> shoppingCart = new ArrayList<>();

    public User() {
    }

    public User(String username, String email, ArrayList<String> purchasedMedialist) {
        this.username = username;
        this.email = email;
        this.purchasedMedialist = purchasedMedialist;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getPurchasedMedialist() {
        return purchasedMedialist;
    }

    public void setPurchasedMedialist(ArrayList<String> purchasedMedialist) {
        this.purchasedMedialist = purchasedMedialist;
    }

    public void addToCart(String item) {
        shoppingCart.add(item);
        System.out.println(item + "added to cart.");
    }

    public void removeFromCart(String itemA) {
        if (shoppingCart.remove(itemA)) {
            System.out.println(itemA + " removed from cart.");
        } else {
            System.out.println(itemA + " was not found in the cart.");
        }
    }

    public void checkout() {
        purchasedMedialist.addAll(shoppingCart);
        shoppingCart.clear();
        System.out.println("Checkout successful. Purchased items: " + purchasedMedialist);
    }

    public void viewCart() {
        System.out.println("Shopping Cart: " + shoppingCart);
    }


}

