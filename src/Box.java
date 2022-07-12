public class Box {
<<<<<<< HEAD
    private static final int delayOff = 1000;
    private static final int delayOn = 3000;
=======
    private final int delay1 = 1000;
    private final int delay3 = 3000;
>>>>>>> ed4b797e050234da987491a87407c1cbffd48954

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
<<<<<<< HEAD
                Thread.sleep(delayOn);
=======
                Thread.sleep(delay3);
>>>>>>> ed4b797e050234da987491a87407c1cbffd48954
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
<<<<<<< HEAD
                    Thread.sleep(delayOff);
=======
                    Thread.sleep(delay1);
>>>>>>> ed4b797e050234da987491a87407c1cbffd48954
                    tumbler = false;
                    System.out.println("Тумблер выключен");
                } catch (InterruptedException e) {

                }
            }
        }
    }
}
