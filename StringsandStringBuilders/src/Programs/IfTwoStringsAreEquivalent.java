package Programs;

import java.util.Arrays;

//Q:https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
public class IfTwoStringsAreEquivalent {
    public static void main(String[] args) {
      String[] word1 = {"ab","c"};
      String[] word2 = {"a","bc"};


        String ans1 = "";
        for (String str : word1) {
             ans1 += str;
        }
        String ans2 = "";
        for(String str : word2){
            ans2 += str;
        }
        System.out.println(ans2);

        if (ans1.equals(ans2)){
            System.out.println("The given String Array are equivalent");
        }else{
            System.out.println("No");
        }
    }
}
