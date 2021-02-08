
import java.util.Scanner;

public class tim_min {
    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }return min;
    }
    public static void main(String[] args) {
        int []arr = {14, 22, 7, 8, 11, 6, 9};
        System.out.println("Min value is: " + minValue(arr));
    }
}
