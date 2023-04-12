package pl.marcin.strategy.radio;

public class ReturnToInnocence implements Song{
    String title = "Return To Innocence";
    String album = "The Cross of Changes";
    String artist = "Enigma";

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
