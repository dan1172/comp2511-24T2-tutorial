package shapes;

public class Rectangle extends Shape {
    // the width variable stores the shapes width
    public int height;
    public int width;



    public Rectangle(String color) {
        super(color);
        System.out.println("Inside Rectangle constructor with one argument");
    }

    /**
     * This function does xyz
     * @param name the full name in english of the rectang;e
     * @param width
     * @param height
     */
    public Rectangle(String name, int width, int height) {
        this(name);
        this.width = width;
        this.height = height;
        System.out.println("Inside Rectangle constructor with three arguments");
    }

    public static void main(String[] args) {
        // Rectangle r = new Rectangle("red", 10, 20);
        System.out.println(Rectangle.x);
        // Rectangle r1 = new Rectangle("red");
        // System.out.println(r1.width);
    }
}
