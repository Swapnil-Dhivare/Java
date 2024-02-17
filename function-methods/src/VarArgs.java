import java.util.Arrays;
import java.util.Scanner;

public class VarArgs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //fun(2,4,5,3,2,3,4,5,3,2,2);
        multiple();


    }
    static void multiple(){
        System.out.println();
    }


    static void fun(int ...v){    // This will allow to take n numbers of values
        System.out.println(Arrays.toString(v));
    }
}
