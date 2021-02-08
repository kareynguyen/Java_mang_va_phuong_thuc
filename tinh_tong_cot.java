import java.util.Scanner;

public class tinh_tong_cot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        System.out.println("Enter " + arr.length + " rows and " + arr[0].length + " columns");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < arr[0].length; j++) {
            int sumCol = 0;
            for (int i = 0; i < arr.length; i++) {
                sumCol += arr[i][j];
            }System.out.println("Sum for colum " + j + " is: " + sumCol);
        }
    }
}
