package pl.marcin.singleton;

public class MainSingleton {
    public static void main(String[] args) {
       SingletonEngine engine =  SingletonEngine.getInstance();
       engine.runSetup();
       engine.run();
       SingletonEngine engine1 = SingletonEngine.getInstance();
       engine1.run();

    }
}
