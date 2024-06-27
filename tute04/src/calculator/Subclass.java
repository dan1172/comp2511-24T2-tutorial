package calculator;

public class Subclass extends Super {
    @Override
    // Preconidtion that x must be 
    // between 0 and 200

    // strengthened would be
    // accepting x between 0 and 50

    // strengthen post condition
    // output of somethjing between
    // 0 and 50
    public int f(int x) {
        return x;
    }
}
