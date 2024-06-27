package youtube;

public class YoutubeTest {
    public static void main(String[] args) {
        Producer u1 = new Producer("Nick");
        Producer newProd = new Producer("Daniel");
        User u2 = new User("Braedon");
        User u3 = new User("Ian");

        u2.subscribeTo(u1);
        u3.subscribeTo(u1);
        u2.subscribeTo(newProd);

        u1.postVideo("The Observer Pattern", 20);
        newProd.postVideo("x", 1);

    }
}