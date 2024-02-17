package Programs;
// Q: https://leetcode.com/problems/to-lower-case/
public class ToLowerCase {
    public static void main(String[] args) {
        String s = "Hello";
        StringBuilder ans = new StringBuilder(s);
        conv(ans,0);
        System.out.println(ans);
    }
    static void conv(StringBuilder ans,int s){
        if (s>ans.length()-1) {
            return;
        }
        char a = ans.charAt(s);

        if (a>='A'&&a<='Z'){
            char newChar = (char)(a+32);
            ans.setCharAt(s,newChar);
            conv(ans,s+1);
        }
         conv(ans,s+1);
    }
}
