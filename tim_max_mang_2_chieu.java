import java.util.Scanner;

public class tim_max_mang_2_chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr =  new int[2][3];
        System.out.println("Enter " + arr.length + " rows and " + arr[0].length + " columns: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max is: " + max);
    }
}
