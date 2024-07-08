package coffee;

public class EspressoShot implements Beverage {
    private Beverage base;

    public EspressoShot(Beverage base) {
        this.base = base;
    }

    public int cost() {
        return base.cost() + 1;
    }

    public static void main(String[] args) {
        BaseDrink base = new BaseDrink();
        Beverage drink = new EspressoShot(base);
        System.out.println(drink.cost());
    }
}
