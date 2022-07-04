public class Box {
    private final int delay1 = 1000;
    private final int delay3 = 3000;

    private volatile boolean tumbler;
    private volatile int countIteration;

    public Box() {
        tumbler = false;
    }

    public void enableTumbler(int numberOfIterations) {
        try {
            for (int i = 0; i < numberOfIterations; i++) {
                tumbler = true;
                System.out.println("Тумблер включен");
                Thread.sleep(delay3);
                countIteration++;
            }
            System.out.println("Игра окончена");
        } catch (InterruptedException e) {

        }

    }

    public void disableTumbler(int max) {
        while (countIteration < max) {
            while (tumbler) {
                try {
                    Thread.sleep(delay1);
                    tumbler = false;
                    System.out.println("Тумблер выключен");
                } catch (InterruptedException e) {

                }
            }
        }
    }
}
