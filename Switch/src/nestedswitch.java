import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        System.out.println("Enter EmpID: ");
        Scanner input = new Scanner(System.in);
        int EmpID = input.nextInt();

        switch (EmpID) {
            case 1 -> System.out.println("Raj Malhotra");
            case 2 -> System.out.println("Simran Singh");
            case 3 -> {
                System.out.println("Swapnil Dhivare");
                String Department = input.next();
                switch (Department) {
                    case "Computer" -> System.out.println("Computer Management");
                    case "Information" -> System.out.println("Information Tech");
                    default -> System.out.println("Ghar pe jaa bhai ");
                }
            }
            default -> System.out.println("Jaane de bro");
        }
    }
}
