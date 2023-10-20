package HilosABC;

public class HilosChatGPT {
	private static Object lock = new Object();
    private static String turno = "a";

    public static void main(String[] args) {
        Thread threadA = new Thread(new MyThread("a"));
        Thread threadB = new Thread(new MyThread("b"));
        Thread threadC = new Thread(new MyThread("c"));

        threadA.start();
        threadB.start();
        threadC.start();
    }

    static class MyThread implements Runnable {
        private String name;

        public MyThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                synchronized (lock) {
                    while (!name.equals(turno)) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println(name);
                    if (name.equals("a")) turno = "b";
                    else if (name.equals("b")) turno = "c";
                    else turno = "a";
                    lock.notifyAll();
                }
            }
        }
    }
}
