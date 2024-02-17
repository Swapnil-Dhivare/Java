package Programs;
// Q: https://leetcode.com/problems/goal-parser-interpretation/
public class GoalParserInterpretation {
    public static void main(String[] args) {
      String command = "G()()()()(al)";
        System.out.println(command.charAt(5));
        StringBuilder ans = new StringBuilder(command);
        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i)=='('&&ans.charAt(i+1)==')'){
                ans.replace(i,i+2,"o");

            }
            if (ans.charAt(i)=='a'){
                ans.replace(i-1,i+3,"al");
            }
        }
        System.out.println(ans);

    }
}
