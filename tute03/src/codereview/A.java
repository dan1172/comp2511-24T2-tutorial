package codereview;

public class A {
    public static void main(String[] args) {
        C c = new C();
        c.speak();
        B b = c;
        b.speak();
        b = new B();
        b.speak();
        c.speak();

    }

}





