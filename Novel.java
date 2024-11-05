import java.util.ArrayList;

public class Novel extends Book {


    private String genre;

    public Novel(String title, String auteur, String ISBN, double price, int stock, ArrayList<String> review, String genre) {
        super(title, auteur, ISBN, price, stock, review);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String getMedia() {

        if (average >= 4.5) {
            return "Bestselling Novel";
        } else {
            return "Novel";
        }

    }
}
