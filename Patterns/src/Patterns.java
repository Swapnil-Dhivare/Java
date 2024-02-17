public class Patterns {
    public static void main(String[] args) {
//        pattern1(5);
//        System.out.println();
//        pattern2(5);
//        System.out.println();
//        pattern3(5);
//        System.out.println();
//          pattern4(5);
//        pattern5(5);
           pattern7(5);
    }
    static void pattern7(int n){
        for (int row = 1; row <=n ; row++) {
            // for spaces
            for (int j = 1; j <= row-1; j++) {
                System.out.print(" ");
            }
                for (int col = 1; col <=n-row+1; col++) {
                    System.out.print("*");
                }

            System.out.println();
        }
    }
    
    static void pattern5(int row){
        for (int i = 1; i <= row; i++) {
            // for spaces
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col<=row; col++) {
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col<=n-row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col<=n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col<=row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}