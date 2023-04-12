package pl.marcin.strategy.radio;

public class BringingItBack implements Song{
    String title = "Bringing it back";
    String album = "Naturally";
    String artist = "J.J.Cale";

    @Override
    public String getArtist() {
        return artist;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAlbum() {
        return album;
    }
    @Override
    public String toString() {
        return "Now is playing :" + getTitle() + "\nArtist: " + getArtist() + "\nfrom Album: " + getAlbum();
    }
}
