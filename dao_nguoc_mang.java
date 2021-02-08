import java.util.Scanner;

public class dao_nguoc_mang {
//Khai bao
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        do {
            if (size > 20){
                System.out.println("Size does not exceed 20");
            }
        }while (size > 20);{
            int [] arr;
            arr = new int [size];
            int i = 0;
            while (i<arr.length){
                System.out.println("Enter value: ");
                arr[i] = sc.nextInt();
                i++;
            }
            System.out.println("Before reversing: ");
            for (int j=0; j<arr.length; j++){
                System.out.print(arr[j] + "\t");
            }

            for (int m = 0, n=size-1; m <= n; m++, n--) {
                int temp = arr[m];
                arr[m] = arr[n];
                arr[n] = temp;
            }

            System.out.println("\nAfter reversing: ");
            for (int m = 0; m < arr.length; m++) {
                System.out.print(arr[m] + "\t");
            }
        }

    }
}

