import java.util.Scanner;

public class enhancedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the name of the fruit:");
        String fruit = in.next();
        switch (fruit) {
            case "Mango" -> System.out.println("King of the fruits");
            case "Apple" -> System.out.println("Red fruit");
            case "Grapes" -> System.out.println("Green fruit");
            default -> System.out.println("please enter respective fruits");
        }
    }
}
