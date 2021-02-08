import java.util.Scanner;

public class dem_ki_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "t, s, d, c, r, d, g, d";
        int n = str.length();
        int count =0;
        System.out.println("Find character: ");
        char C = sc.next().charAt(0);
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == C){
                count++;
            }
        }
        System.out.println("There are: " + count + " character " + C + " in string");
    }
}
