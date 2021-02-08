import java.util.Scanner;

public class gop_phan_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array 1: ");
        int s1 = sc.nextInt();
        int []a1 = new int[s1];
        for (int i = 0; i < s1; i++) {
            System.out.println("Enter value");
            a1[i]=sc.nextInt();
        }
        System.out.println("Enter size of array 2: ");
        int s2 = sc.nextInt();
        int []a2 = new int[s2];
        for (int j = 0; j < s2; j++) {
            System.out.println("Enter value");
            a2[j] = sc.nextInt();
        }
        int []aTotal = new int[s1+s2];
        int m=0;
        int n=0;
        System.out.println("Combined array is: ");
        for (m = 0; m < a1.length; m++) {
            aTotal[m] = a1[m];
        }
        for (n = 0; n < a2.length; n++) {
            aTotal[m++] = a2[n];
        }
        for (int value:aTotal) {
            System.out.print(value + "\t");
        }

    }
}
