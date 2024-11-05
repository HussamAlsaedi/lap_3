import java.util.ArrayList;

public class AcademicBook extends Book {
    private String subject;

    public AcademicBook(String title, String auteur, String ISBN, double price, int stock, ArrayList<String> review, String subject) {
        super(title, auteur, ISBN, price, stock, review);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getMedia() {

        double average = super.average;

        if (average >= 4.5) {
            return "Bestselling Academic Book";
        } else {
            return "Academic Book";
        }
    }

    @Override
    public String toString() {
        return "AcademicBook{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuteur() + '\'' +
                ", subject='" + subject + '\'' +
                ", price=" + getPrice() +
                ", stock=" + getStock() +
                ", average rating=" + super.average +
                '}';
    }
}
