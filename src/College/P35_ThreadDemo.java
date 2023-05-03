package College;

class HelloThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class WorldThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("World");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class P35_ThreadDemo {
    public static void main(String[] args) {
        HelloThread helloThread = new HelloThread();
        WorldThread worldThread = new WorldThread();
        helloThread.start();
        worldThread.start();
    }
}