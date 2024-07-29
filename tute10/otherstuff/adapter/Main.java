package otherstuff.adapter;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        System.out.println("Round peg fits in round hole: " + hole.fits(roundPeg)); // true
        System.out.println("Small square peg fits in round hole: " + hole.fits(smallSquarePegAdapter)); // true
        System.out.println("Large square peg fits in round hole: " + hole.fits(largeSquarePegAdapter)); // false
    }
}
