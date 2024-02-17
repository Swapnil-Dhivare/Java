package Programs;

import java.util.Random;

// Q: https://leetcode.com/problems/jump-game-vii/description/
public class JumpGameVII {
    public static void main(String[] args) {
        int minJump = 2;
        int maxJump = 3;
        String s = "000100100010";
        int i = 0;
        int a = i + minJump;
//        int min = min(i+maxJump,s);

        while (i<s.length()-1){
            Random random = new Random();
            int j = i + random.nextInt(maxJump - minJump + 1) + minJump;
            j = Math.min(j, s.length() - 1);
            if (s.charAt(j)=='0'){
               i = j;
            }
            else{
                break;
            }
        }

    }
}
