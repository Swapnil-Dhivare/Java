import java.util.Arrays;

public class ShuffletheArray {
    /*
     Q: Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
        Return the array in the form [x1,y1,x2,y2,...,xn,yn].
     */
    public static void main(String[] args) {
          int n = 3;
          int[] inp = {2,5,1,3,4,7};
          int[] out = new int[2*n];
          out[0] = inp[0];
        int a = 1;
        for (int i = 1; i < 2 * n; i++) {


            if (i%2==0){
                out[i] = inp[i - i/2];
            }else{
                int s = i-a;
                out[i] = inp[s +n];
//                out[i] = inp[i-a + n];
                a++;
           }

        }
        System.out.println(Arrays.toString(out));
    }
}
