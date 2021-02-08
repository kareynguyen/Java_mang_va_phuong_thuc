import java.util.Scanner;

public class xoa_phan_tu {
    public static void main(String[] args) {
        int a[] = {5,7,6,12,9,36,0,0};
        int X = 6;
        int index_del = 0;

        // xóa phần tử
        for (int i = 0; i < a.length ; i++) {
            if (X == a[i]){
                index_del = i;
            }
        }
        for (int j = index_del; j < a.length-1; j++) {
            a[j] = a[j+1];
        }
        System.out.println("Sau khi khi xóa phần tử " + X);
        for (int element : a) {
            System.out.print(element + " ");
        }
    }

        }

