import java.util.Scanner;

public class dem_so_luong_sinh_vien_do {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        System.out.println("Enter marks of students");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        System.out.println("List of marks: ");
        for (int m = 0; m < arr.length; m++) {
            System.out.print(arr[m] + "\t");
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]>=5 && arr[j] <=10){
                count++;
            }
        }System.out.println("\nNumber of passed students are: " + count);

    }
}
