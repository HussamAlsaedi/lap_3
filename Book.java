import java.util.ArrayList;

public class Book extends Media {
    double average = 0;
    ArrayList<String> review = new ArrayList<>();
    private int stock;


    public Book(String title, String auteur, String ISBN, double price, int stock, ArrayList<String> review) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.review = review;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<String> getReview() {
        return review;
    }

    public void setReview(ArrayList<String> review) {
        this.review = review;
    }

    public void addReview(String review) {
        this.review.add(review);
    }

    public void removeReview(String review) {
        this.review.remove(review);
    }

    public double getAverageRating(ArrayList Review) {
        int sum = 0;
        for (int l = 0; l < review.size(); l++) {
            sum += Integer.parseInt(review.get(l));
        }
        average = sum / review.size();

        return average;
    }

    public String getMedia() {

        if (average >= 4.5) {
            return "Bestselling Book";
        } else {
            return "Book";
        }

    }

    public void purchase(User user) {

        if (stock >= 1) {
            user.getPurchasedMedialist().add(this.getTitle());
            stock--;
            System.out.println("Purchase successful. Remaining stock: " + stock);
        } else {
            System.out.println("No stock available.");
        }

    }


    public void restock(int quantity) {
        stock = +quantity;
        System.out.println("current stock: " + stock);
    }

    @Override
    public String toString() {
        return "Book{" +
                "stock=" + stock +
                ", average=" + average +
                ", review=" + review +
                '}';
    }
}
