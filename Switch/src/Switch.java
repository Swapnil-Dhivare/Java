import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        switch (fruit) {
            case "Mango":
                System.out.println("King of the fruits");
                break;
            case "Apple":
                System.out.println("Red fruit");
                break;
            case "Grapes":
                System.out.println("Green fruit");
                break;
            default:
                System.out.println("please enter respective fruits");
                break;
        }

        switch (fruit) {
            case "Mango" -> System.out.println("King of the fruits");
            case "Apple" -> System.out.println("Red fruit");
            case "Grapes" -> System.out.println("Green fruit");
            default -> System.out.println("please enter respective fruits");
        }
    }
}