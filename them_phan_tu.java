import java.util.Scanner;

public class them_phan_tu {
    public static void main(String[] args) {
        int a[] = {2,3,5,8,4,6,0};
        int atIndex = 2;
        int value = 9;

        for (int i = a.length-1; i > atIndex; i--) {
            a[i] = a[i-1];
        }
        a[atIndex] = value;
        System.out.println("Sau khi chèn phần tử " + value + " tại chỉ số " + atIndex);
        for (int element : a) {
            System.out.print(element + " ");
        }
    }

}

