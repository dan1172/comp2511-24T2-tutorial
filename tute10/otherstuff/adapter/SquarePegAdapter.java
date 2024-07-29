package otherstuff.adapter;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(0); // Dummy value, we'll override getRadius method
        this.peg = peg;
    }

    @Override
    public int getRadius() {
        // Calculate the minimum circle radius that can fit this square peg
        return (int) (peg.getWidth() * Math.sqrt(2) / 2);
    }
}
