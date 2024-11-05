import java.util.ArrayList;

public class Store {

    private final ArrayList<String> users;
    private final ArrayList<String> media;


    public Store() {
        users = new ArrayList<>();
        media = new ArrayList<>();
    }


    public Store(ArrayList<String> users, ArrayList<String> media) {
        this.users = users;
        this.media = media;
    }


    public void addUser(String user) {
        users.add(user);
    }


    public void displayUsers() {
        System.out.println("Registered Users:");
        for (String user : users) {
            System.out.println(user);
        }
    }


    public void addMedia(String mediaItem) {
        media.add(mediaItem);
    }


    public void displayMedia() {
        System.out.println("Available Media:");
        for (String mediaItem : media) {
            System.out.println(mediaItem);
        }
    }


    public void searchMedia(String title) {

        boolean found = false;
        for (String mediaItem : media) {
            if (mediaItem.contains(title)) {
                System.out.println("Movie: " + mediaItem + "is in the store");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No media found with the title: " + title);
        }
    }

    @Override
    public String toString() {
        return "Store{" +
                "Users=" + users +
                ", Media=" + media +
                '}';
    }

    /*addUser(User user): Adds a user to the list of users.
            • displayUsers(): Displays a list of registered users.
            • addMedia(Media media): Adds a media to the list of medias.
            displayMedias(): Displays a list of Available medias.
• searchBook(String title): Searches for a book by title and returns it if found.
*/
}
