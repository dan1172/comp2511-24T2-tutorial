package singleton;

public class Singleton {
    private Singleton instance;

    private Singleton() {
    }

    public Singleton getInstance() {
        if (instance == null) {
            return new Singleton();
        }
        return instance;
    }
}
