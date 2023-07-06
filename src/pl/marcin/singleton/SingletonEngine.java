package pl.marcin.singleton;

import java.util.Scanner;

public class SingletonEngine {
    private int power;
    private String name;
    private static SingletonEngine instance;

    private SingletonEngine() {
    }


    public void runSetup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("set up your new engine name:");
        name = scanner.nextLine();
        System.out.println("Set up your new engine power: ");
        power = scanner.nextInt();
    }

    public void run() {
        System.out.println("This new Engine with name: " + name + " has power " + power);
    }

    public static SingletonEngine getInstance() {
        if (instance == null) {
            synchronized (SingletonEngine.class) {
                if (instance == null) {
                    instance = new SingletonEngine();
                }
            }
        }

        return instance;
    }
}
