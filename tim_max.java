import java.util.Scanner;

public class tim_max {
    public static void main(String[] args) {
        int []arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        if (size>20){
            System.out.println("Size does not exceed 20");
        }while (size>20);{
            arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter value");
                arr[i] = sc.nextInt();
            }
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j] + "\t");
            }
            int max = arr[0];
            int index = 1;
            for (int m = 0; m < arr.length; m++) {
                if (max < arr[m]){
                    max = arr[m];
                    index = m + 1;
                }
            }
            System.out.println("Max in the above array is: " + max + " at position " + index);

        }
    }
}
