public abstract class Duck {
    private FlyBehaviour flyBehaviour;

    public void display() {
        System.out.println("I am a duck");
    }

    public void fly() {
        flyBehaviour.fly();
    }

    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public static void main(String[] args) {
        CloudDuck cloudDuck = new CloudDuck();
        cloudDuck.setFlyBehaviour(new Fly2());
        cloudDuck.fly();
    }
}
