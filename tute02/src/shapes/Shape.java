package shapes;

public class Shape {
    public String color;
    public static int x = 5;

    public Shape(String color) {
        System.out.println("Inside Shape constructor");
        this.color = color;
    }
}
