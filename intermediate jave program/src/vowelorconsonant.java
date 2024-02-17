import java.util.Scanner;

public class vowelorconsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The String");
        String i = in.next();
        char a = i.trim().charAt(0);
        System.out.println(a);
        vowelconsonant(a);
    }
    static void vowelconsonant(char a){
        switch (a) {
            case 'a', 'e', 'i', 'o', 'u','A','E','I','O','U' -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }
    }
}
