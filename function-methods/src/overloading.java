import java.util.Arrays;

public class overloading {
    public static void main(String[] args) {
//        fun(45,33);
//        fun(3);
//        demo(3,4);
        demo(3,4);
    }


    static void fun(int a){
        System.out.println(a);
    }

    static void fun(int b, int a){
        System.out.println(a );
        System.out.println(b);

    }

    static void demo(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }
    static void demo(int a, int...v){
        System.out.println(a);
        System.out.println(Arrays.toString(v));
    }
}
