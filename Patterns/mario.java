package Patterns;

public class mario {
    public static void main(String[] args) {
        int n = 4;
        int col;
        for (int row = 1; row <= n; row++) {

            for (int s = 0; s <= n-row; s++)
            {
                System.out.print(" ");
            }
            for (col = 0; col <= row; col++)
            {
                System.out.print("#");
            }
            System.out.print(" ");
            for (int col2 = 0; col2 <= row; col2++) {
                System.out.print("# ");
            }
            System.out.println();
        }

    }
}
