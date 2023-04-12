package pl.marcin.strategy.radio;

public class PermanentVacation implements Song{
    String title = "Permanent Vacation";
    String album = "Permanent Vacation";
    String artist = "Aerosmith";

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
