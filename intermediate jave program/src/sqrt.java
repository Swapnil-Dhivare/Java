import java.util.Scanner;
// Q: https://leetcode.com/problems/sqrtx/
public class sqrt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int ans =ans( x);
        System.out.println(ans);


    }
    static int ans(int x){
//        if(x==0) {
//            return 0;
//        }
//        int i=1;
//        for(;i<=x/i;i++) //using division instead of multiplication to avoid integer overflow
//        {
//            if(x/i==i)  return i;
//        }
//        return i-1; //returning (i-1) because at some point (i*i) became greater than x and loop stopped!!
        if (x == 0) {
            return 0;
        }
        int i;
        for (i = 1; i <= x / i; i++) {
            if (x/i == i) {
                return i;
            }
        }
        return i - 1;
    }

}

