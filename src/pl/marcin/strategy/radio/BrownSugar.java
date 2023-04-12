package pl.marcin.strategy.radio;

public class BrownSugar implements Song{
    String title = "Brown Sugar";
    String album = "Forthy Licks";
    String artist = "Rolling Stones";

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
