public class Main {

    public static void main(String[] args) {

        final int iterations = 5;
        Box box = new Box();

        Thread user = new Thread(null, () -> box.enableTumbler(iterations), "User");

        Thread toy = new Thread(null, () -> box.disableTumbler(iterations), "Toy");

        user.start();
        toy.start();
        if(!user.isAlive())
            toy.interrupt();

    }
}
