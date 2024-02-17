public class Shadowing {
    static int x = 88;   // this will be shadowed at line 7

    public static void main(String[] args) {
        System.out.println(x); // 88
        int x = 80;
        System.out.println(x); // 80
        fun();  // 88

    }
    public static void fun(){

        System.out.println(x);
    }
}
