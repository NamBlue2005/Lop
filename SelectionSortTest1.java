import java.util.Random;

public class SelectionSortTest1 {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[100000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000);
        }
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        selectionSort(array);
        stopwatch.stop();
        System.out.println("Thời gian thực thi thuật toán sắp xếp chọn: " + stopwatch.getElapsedTime() + " milliseconds");
    }
}