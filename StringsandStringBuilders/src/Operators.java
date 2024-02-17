import java.awt.*;
import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        // this is adding the ASCII values of these characters
        System.out.println("a" + "b");
        // This is merging them together
        System.out.println('a' + 3);
        // This is adding the ASCII values of a,b,c & d
        System.out.println((char)('a' + 3));
        // This is converting 100 into a character
        System.out.println("a" + 1);
        // this is same as after a few steps : "a" + "1"
        // integer will be converted to Integer that will call toString()
        System.out.println("Sunny" + new ArrayList<>());

        //+ is the only operator in java that has been modified to concatinate strings.



    }
}
