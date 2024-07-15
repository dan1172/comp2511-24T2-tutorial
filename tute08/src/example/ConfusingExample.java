package example;

public class ConfusingExample<T> {
    private T t1; // whats stored is a string

    public ConfusingExample(T t1) {
        this.t1 = t1;
    }
    
    public T getThing() {
        return t1;
    }

    // public <T> T foo(T t) { 
    //     return t;
    // }
 
    public static <T> T staticFoo(T t) {
        return null;
    }

    public static void main(String[] args) {
        ConfusingExample e = new ConfusingExample<String>("boo");
        // System.out.println(e.getThing());
        // System.out.println(e.foo(5));

    }
}
