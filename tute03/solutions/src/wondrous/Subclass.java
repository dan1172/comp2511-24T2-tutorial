package wondrous;

public class Subclass extends Superclass {
    private String name;

    // Constructor
    Subclass(String name, int num){
        super(num);
        this.name = name;
    }
 

    public static void main(String[] args) {
        Subclass thing = new Subclass("daniel", 0)
    }
}
