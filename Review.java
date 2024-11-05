public class Review {
    // Properties: username, rating, and comments
    private String username;
    private String rating;
    private String comments;

    public Review(String username, String rating, String comments) {
        this.username = username;
        this.rating = rating;
        this.comments = comments;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
