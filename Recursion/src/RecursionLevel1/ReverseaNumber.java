package Recursion.src.RecursionLevel1;

public class ReverseaNumber {
    static int  sum = 0;
    static void rev2(int n){
        if (n == 0) {
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        rev2(n/10);
    }
    public static void main(String[] args) {
        rev2(1234);
        System.out.println(sum);
//        System.out.println(rev(4421,3));


    }
    static int rev(int n,int a){
        if (n%10==n){
            return n;

        }
        return (int) ((n%10)*(Math.pow(10,a))+ rev(n/10,a-1));
    }


}
