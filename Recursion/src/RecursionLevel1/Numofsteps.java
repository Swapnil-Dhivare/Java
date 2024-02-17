package Recursion.src.RecursionLevel1;

public class Numofsteps{
    public static void main(String[] args) {
         int ans = steps(41,0);
        System.out.println(ans);
    }
    static int steps(int n,int c){
        if (n==0){
            return c;
        }
        if(n%2==0){
            return steps(n/2,c+1);
        }
        return steps(n-1,c+1);
    }
}