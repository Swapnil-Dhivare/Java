public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        scope();
       // System.out.println(num); /// num is initialised in scope function that's why we can't access it here
                  // BLOCK SCOPE
        {
            a = 77;  // a is already initialised outside this block in the same method hence can be modified but can't be initialised again
            int v = 88;
        }
       // System.out.println(v); This will give error
        System.out.println(a);
    }
    public static void scope(){
        int a = 99;
        int b = 44;
        int num = 45;
         // This change is only valid in 'scope' function , it can't be accessed by any another function
    }
}
