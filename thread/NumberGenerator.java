package thread;

public class NumberGenerator implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Số: " + i + " - HashCode: " + this.hashCode());
            try {
                Thread.sleep(500); // Dừng 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Tạo đối tượng NumberGenerator
        NumberGenerator generator1 = new NumberGenerator();
        NumberGenerator generator2 = new NumberGenerator();

        // Tạo đối tượng Thread với tham số là 2 đối tượng generator
        Thread thread1 = new Thread(generator1);
        Thread thread2 = new Thread(generator2);

        // Đặt độ ưu tiên cho các thread
        thread1.setPriority(Thread.MAX_PRIORITY);  // Đặt độ ưu tiên cao nhất
        thread2.setPriority(Thread.MIN_PRIORITY);  // Đặt độ ưu tiên thấp nhất

        // Bắt đầu các thread
        thread1.start();
        thread2.start();
    }
}