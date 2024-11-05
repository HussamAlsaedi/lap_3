import java.util.ArrayList;

public class Movie extends Media {
    private int duration;

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    public void watch(User user) {

        user.getPurchasedMedialist().add(this.getTitle());
        System.out.println(user.getUsername() + " is watching " + this.getTitle());
    }


    public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> movieCatalog) {
        ArrayList<Movie> recommendations = new ArrayList<>();
        for (Movie movie : movieCatalog) {
            // Check if the movie has the same director (auteur) but is not the same movie
            if (movie.getAuteur().equals(this.getAuteur()) && !movie.getTitle().equals(this.getTitle())) {
                recommendations.add(movie);
            }
        }
        return recommendations;
    }


    public String getMedia() {
        if (duration >= 120) {
            return "Long Movie";
        } else {
            return "Movie";
        }

    }


    @Override
    public String toString() {
        return "Movie Title: " + getTitle() +
                "\nDirector: " + getAuteur() +
                "\nISBN: " + getISBN() +
                "\nPrice: $" + getPrice() +
                "\nDuration: " + duration + " minutes" +
                "\nType: " + getMedia();
    }
}
