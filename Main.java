import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        list.add("1 - test Media");
        list.add("2 - test Book");
        list.add("3 - test Movie");
        list.add("4 - test Music");
        list.add("5 - test Store");
        list.add("6 - test user");
        list.add("7 - test Review");
        list.add("8 - test AcademicBook");
        list.add("9 - test Novel");
        list.add("0 - Exit");

        boolean counter = true;
        do {
            try {
                System.out.println();
                for (String s : list) {
                    System.out.println(s);
                }
                System.out.println();
                System.out.println("Please enter a number From list it shall between 1 and 9 or 0 to exit");


                int n = sc.nextInt();
                switch (n) {
                    case 1:
                        testMedia();
                        break;
                    case 2:
                        testBook();
                        break;
                    case 3:
                        testMovie();
                        break;
                    case 4:
                        testMusic();
                        break;
                    case 5:
                        testStore();
                        break;
                    case 6:
                        testUser();
                        break;
                    case 7:
                        testReview();
                        break;
                    case 8:
                        testAcademicBook();
                        break;
                    case 9:
                        testNovel();
                        break;
                    case 0:
                        counter = false;
                    default:
                        counter = false;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("input number method to test it");
            }

        } while (counter);


    }

    public static void testMedia() {

        Media media = new Media("Learning Java", "Alice Johnson", "111-2223334445", 19.99);

        System.out.println("Original  Media Information:");
        System.out.println(media);

        media.setTitle("Mastering Java");
        media.setAuteur("Bob Williams");
        media.setISBN("ISBN5555");
        media.setPrice(55.00);

        System.out.println();
        System.out.println("Updated Media Information:");
        System.out.println(media);
    }

    public static void testBook() {
        ArrayList<String> reviews = new ArrayList<>();
        reviews.add("3");
        reviews.add("4");
        reviews.add("2");

        Book book = new Book("JAVA", "John Smith", "ISBN435", 20.6, 2, reviews);

        System.out.println("Original Book Information:");
        System.out.println(book);

        double averageRating = book.getAverageRating(reviews);
        System.out.println("Average Rating: " + averageRating);
        System.out.println("Media Type: " + book.getMedia());

        book.addReview("5");
        averageRating = book.getAverageRating(book.getReview());
        System.out.println();
        System.out.println("Updated Average Rating after adding a review: " + averageRating);
        System.out.println("Media Type: " + book.getMedia());

        User user = new User();
        book.purchase(user);

        System.out.println();
        System.out.println("Updated Book Information after purchase:");
        System.out.println(book);

        book.restock(10);
        System.out.println();
        System.out.println("Book Information after restocking:");
        System.out.println(book);
    }

    public static void testMovie() {

        User user = new User("john_doe", "john@example.com", new ArrayList<>());

        // Create some movies
        Movie movie1 = new Movie("Inception", "Christopher Nolan", "123456789", 14.99, 148);
        Movie movie2 = new Movie("The Dark Knight", "Christopher Nolan", "987654321", 12.99, 152);
        Movie movie3 = new Movie("Interstellar", "Christopher Nolan", "112233445", 15.99, 169);

        movie1.watch(user);

        System.out.println(movie1);

        ArrayList<Movie> movieCatalog = new ArrayList<>();
        movieCatalog.add(movie1);
        movieCatalog.add(movie2);
        movieCatalog.add(movie3);

        ArrayList<Movie> recommendations = movie1.recommendSimilarMovies(movieCatalog);

        System.out.println("Recommended Movies:");
        for (Movie recommendedMovie : recommendations) {
            System.out.println(recommendedMovie.getTitle());
        }

        // View purchased media list
        System.out.println("Purchased Media List: " + user.getPurchasedMedialist());
    }

    public static void testMusic() {

        ArrayList<Movie> movieCatalog = new ArrayList<>();
        movieCatalog.add(new Movie("The Shawshank Redemption", "Frank Darabont", "ISBN2223334445", 12.99, 142));
        movieCatalog.add(new Movie("The Godfather", "Francis Ford Coppola", "ISBN3334445556", 14.99, 175));
        movieCatalog.add(new Movie("The Dark Knight", "Christopher Nolan", "ISBN4445556667", 16.99, 152));

        Movie selectedMovie = movieCatalog.get(2);

        User user = new User();
        user.setUsername("JaneDoe");

        System.out.println("Selected Movie Information: " + selectedMovie);

        System.out.println("Simulate watching the movie: ");
        selectedMovie.watch(user);

        ArrayList<Movie> recommendations = selectedMovie.recommendSimilarMovies(movieCatalog);
        System.out.println();
        System.out.println("Recommended Movies Directed by " + selectedMovie.getAuteur() + ":");
        for (Movie movie : recommendations) {
            System.out.println(movie.getTitle() + " - Duration: " + movie.getDuration() + " minutes");
        }
    }

    public static void testUser() {
        User user = new User("john_doe", "john@example.com", new ArrayList<>());


        user.addToCart("Item 1");
        user.addToCart("Item 2");

        user.viewCart();

        user.removeFromCart("Item 1");

        System.out.println();
        user.viewCart();

        user.checkout();
        System.out.println();
        user.viewCart();
    }

    public static void testStore() {
        Scanner sc = new Scanner(System.in);
        Store store = new Store();
        store.addUser("ahmed");

        store.addMedia("The Matrix");
        store.addMedia("Inception");
        store.addMedia("The Dark Knight");

        store.displayUsers();
        store.displayMedia();

        System.out.println("input title of movie to check in our list");
        String movieTitle = sc.nextLine();
        store.searchMedia(movieTitle);
    }

    public static void testReview() {

        Review review1 = new Review("David", "4", "Good book with helpful information");

        System.out.println("Review by: " + review1.getUsername());
        System.out.println("Rating: " + review1.getRating());
        System.out.println("Comments: " + review1.getComments());
        System.out.println();


        review1.setRating("1");
        review1.setComments("Excellent book! Highly recommended.");

        System.out.println("Updated Review by: " + review1.getUsername());
        System.out.println("Updated Rating: " + review1.getRating());
        System.out.println("Updated Comments: " + review1.getComments());
    }

    public static void testAcademicBook() {
        ArrayList<String> reviews1 = new ArrayList<>();
        reviews1.add("An essential read for any computer scientist.");
        reviews1.add("Thorough explanations and examples.");

        AcademicBook book1 = new AcademicBook("Data Structures and Algorithms Made Easy", "Narasimha Karumanchi", "978-9352132131", 44.36, 22, reviews1, "Computer Science");

        System.out.println(book1);
        System.out.println("Media type: " + book1.getMedia());

        book1.setSubject("Advanced Data Structures");
        System.out.println("Updated subject: " + book1.getSubject());

        ArrayList<String> reviews2 = new ArrayList<>();
        reviews2.add("A comprehensive guide to algorithms.");
        reviews2.add("Highly recommended for beginners.");

        AcademicBook book2 = new AcademicBook("Algorithms Unlocked", "Thomas H. Cormen", "978-0262033848", 36.58, 66, reviews2, "Algorithms");

        System.out.println(book2);
        System.out.println("Media type: " + book2.getMedia());
    }

    public static void testNovel() {
        ArrayList<String> reviews1 = new ArrayList<>();
        reviews1.add("A thrilling adventure from start to finish!");
        reviews1.add("Characters were well-developed and engaging.");

        Novel novel1 = new Novel("The Great Gatsby", "F. Scott Fitzgerald", "ISBN0743265", 43.09, 50, reviews1, "Classic Literature");

        System.out.println(novel1);
        System.out.println("Media type: " + novel1.getMedia());

        novel1.setGenre("American Classic");
        System.out.println("Updated genre: " + novel1.getGenre());

        ArrayList<String> reviews2 = new ArrayList<>();
        reviews2.add("An interesting take on modern society.");
        reviews2.add("Loved the twists and turns throughout the story.");

        Novel novel2 = new Novel("1984", "George Orwell", "ISBN423453", 11.29, 25, reviews2, "Dystopian Fiction");

        System.out.println(novel2);
        System.out.println("Media type: " + novel2.getMedia());
    }


}