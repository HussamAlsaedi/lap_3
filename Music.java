import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Music extends Media {
    private String artist;
    private ArrayList<String> music;
    private ArrayList<Music> mediaCatalog;


    public Music(String title, String auteur, String ISBN, double price, String artist, ArrayList<String> music, ArrayList<Music> mediaCatalog) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
        this.music = music;
        this.mediaCatalog = mediaCatalog;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public ArrayList<String> getMusic() {
        return music;
    }

    public void setMusic(ArrayList<String> music) {
        this.music = music;
    }

    public ArrayList<Music> getMediaCatalog() {
        return mediaCatalog;
    }

    public void setMediaCatalog(ArrayList<Music> mediaCatalog) {
        this.mediaCatalog = mediaCatalog;
    }

    public void listen(User user) {
        System.out.println(user.getUsername() + " is listening to " + this.artist + "'s music.");
    }

    public List<Music> generatePlaylist(List<Music> musicCatalog) {
        return musicCatalog.stream()
                .filter(m -> m.getArtist().equalsIgnoreCase(this.artist))
                .collect(Collectors.toList());
    }

    @Override
    public String getMedia() {
        if (getPrice() >= 10) {
            return "Premium Music";
        } else {
            return "Music";
        }
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + getTitle() + '\'' +
                ", artist='" + artist + '\'' +
                ", price=" + getPrice() +
                ", type=" + getMedia() +
                '}';
    }
}
