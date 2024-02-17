package Programs;
/*
 Q:https://leetcode.com/problems/shuffle-string/
 Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
*/
public class ShuffleString {
    public static void main(String[] args) {
     String s = "codeleet";
     int[] indices = {4,5,6,7,0,2,1,3};

     StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            sb.setCharAt(indices[i],s.charAt(i));
        }
        String output = sb.toString();
        System.out.println(output);
    }

}
