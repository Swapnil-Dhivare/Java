package RecursionLevel1;

public class printnto1 {
    public static void main(String[] args) {
//        func(5);
        funcrev(8);
    }
    static void func(int n){
              if (n==0){
                  return;
              }
            System.out.println(n);

            func(n - 1);


    }
    static void funcrev(int n){
        if (n==0){
            return;
        }


        funcrev(n - 1);
        System.out.println(n);

    }
}
