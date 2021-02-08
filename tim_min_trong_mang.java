import java.util.Scanner;

public class tim_min_trong_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int SIZE = sc.nextInt();
        int [] arr = new int[SIZE];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter values: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("\nMin is: " + min);
    }
}
