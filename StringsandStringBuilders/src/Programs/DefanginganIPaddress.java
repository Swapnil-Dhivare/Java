package Programs;
// Q:https://leetcode.com/problems/defanging-an-ip-address/solutions/3908104/100-easy-and-optimised-solution-in-java/
public class DefanginganIPaddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i)=='.') {
                sb.append("[");
                sb.append(".");
                sb.append("]");
            }
            else{
                sb.append(address.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
