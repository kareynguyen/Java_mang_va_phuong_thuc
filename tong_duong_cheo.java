import java.util.Scanner;

public class tong_duong_cheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        System.out.println("Enter " + arr.length + " rows and " + arr[0].length + " columns");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sumDiagonal = 0;
        for (int i = 0; i < arr.length; i++) {
            sumDiagonal += arr[i][i];
        }
            System.out.println("Sum of diagonal is: " + sumDiagonal);

    }
}
