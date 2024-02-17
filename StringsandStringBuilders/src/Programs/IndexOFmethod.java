package Programs;
//Q: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class IndexOFmethod {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "sad";
        int index = haystack.indexOf(needle);
        if (index!=-1){
            System.out.println("Substring found at index " + index);
        }else {
            System.out.println("Substring not found");
        }
    }
}
