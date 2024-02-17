import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistexample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // When u don't know the size of the array but still want to create an array use arraylist

        ArrayList<Integer> list = new ArrayList<>();
//        list.add(88);
//        list.add(87);
//        list.add(33);
//        list.add(43);
//        System.out.println(list.contains(88));
//        // we can add as many list as we want, we can add more than 10 also
//        System.out.println(list);
//        list.set(0,99);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);

        // input
        for (int i = 0; i < 10; i++) {
           list.add(in.nextInt());
        }
        // get item at any index
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));   // pass index here , list[index] syntax will not work here
        }
        System.out.println(list);
    }
}
