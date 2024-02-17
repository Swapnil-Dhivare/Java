public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
            // here it is not creating new object but adding after
            // inituation in the same object
        }
        System.out.println(builder.toString());
    }
}
