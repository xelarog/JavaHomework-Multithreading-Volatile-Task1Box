public class Main {

    public static void main(String[] args) {

        final int ITERATIONS = 5;
        Box box = new Box();

        Thread user = new Thread(null, () -> box.enableTumbler(ITERATIONS), "User");

        Thread toy = new Thread(null, () -> box.disableTumbler(ITERATIONS), "Toy");

        user.start();
        toy.start();
        if(!user.isAlive())
            toy.interrupt();

    }
}
