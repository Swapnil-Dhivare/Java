import java.io.FilterOutputStream;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("Type your Roll No.");
        Scanner input = new Scanner(System.in);
        int Rollno = input.nextInt();
        System.out.println("Your Roll No. is: " + Rollno);
    }
}
