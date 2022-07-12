public class Box {

    private static final int delayOff = 1000;
    private static final int delayOn = 3000;

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
                Thread.sleep(delayOn);
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
                    Thread.sleep(delayOff);
                    tumbler = false;
                    System.out.println("Тумблер выключен");
                } catch (InterruptedException e) {

                }
            }
        }
    }
}
