import java.util.Random;

class Checked {
    private static Thread ancientCounter = new AncientCounter(); // This one was created to count.. just count
    private static Random random = new Random();

    private static class AncientCounter extends Thread {
        private int counter = 0;

        @Override public void run() {
            while (counter >= 0) { // It's because he's ancient
                counter++;
                try { // Beginning of protected block
                    sleep(1000); // This method has 'throws' in it's declaration so exception !must be handled
                    System.err.println(String.format("It's time for %d", counter));
                } catch (InterruptedException e) { // Here we specify exception type we want to catch
                    System.err.println("You bothered me, mortal!");
                    uuuuaaaaaaarrrrrrgggggghhhh();
                }
            }
        }

        private void uuuuaaaaaaarrrrrrgggggghhhh() {
            for (int i = 0; i < 1000; i++) {
                counter--;
//                System.err.println("mazafaka");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException { // If exception call reaches here our program stops
        ancientCounter.start(); // Beginning of the world
        Thread.sleep(getRandomMillisecondsValue()); // Some time passes (Here we also call sleep but let JVM handle exception)
        attackAncient(); // Some treasure hunters were a bit reckless
    }

    private static void attackAncient() {
        System.out.println("Let's handle this, bitch");
        ancientCounter.interrupt();
    }

    private static int getRandomMillisecondsValue() {
        return (random.nextInt(4) + 3) * 1000;
    }
}
