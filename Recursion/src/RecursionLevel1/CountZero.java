package Recursion.src.RecursionLevel1;

public class CountZero {
    public static void main(String[] args) {
        int n = 30200;
        int c = 0;
        System.out.println(ans(n,c));

    }
    static int ans(int n,int c){
        if (n==0){
            return c;
        }
        int rem = n%10;
        if (rem==0){
            return ans(n/10,c+1);
        }
        return ans(n/10,c);


    }
}
