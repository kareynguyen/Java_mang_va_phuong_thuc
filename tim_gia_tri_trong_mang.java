import java.util.Scanner;

public class tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Phoebes", "Piper", "Prue"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)){
                System.out.println("Student " + name + " is at position " + (i + 1));
                isExist = true;
                break;
            }
            }if (!isExist){
            System.out.println("Not found name " + name + " in the list.");
        }

    }
}
