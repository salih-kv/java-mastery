public class ThreadExample extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        ThreadExample thread = new ThreadExample();
        thread.start(); // Starting a new thread
    }
}
