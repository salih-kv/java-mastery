public class Counter {
    private int count = 0;

    // Synchronized method to ensure thread safety
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();

        // Multiple threads modifying the count
        Thread t1 = new Thread(counter::increment);
        Thread t2 = new Thread(counter::increment);
        t1.start();
        t2.start();
    }
}
