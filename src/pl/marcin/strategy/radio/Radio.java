package pl.marcin.strategy.radio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Radio {
    Random random = new Random();
    private static List<Song> radioList = new ArrayList<>();
    static {
        Song brown = new BrownSugar();
        Song bringing = new BringingItBack();
        Song permanent = new PermanentVacation();
        Song returnTo = new ReturnToInnocence();
        radioList.add(brown);
        radioList.add(bringing);
        radioList.add(permanent);
        radioList.add(returnTo);
    }
    public Song getSong(){
        int index = random.nextInt(radioList.size());
        return radioList.get(index);
    }
}
