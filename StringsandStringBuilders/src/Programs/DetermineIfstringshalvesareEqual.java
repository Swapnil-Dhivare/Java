package Programs;
// Q: https://leetcode.com/problems/determine-if-string-halves-are-alike/
public class DetermineIfstringshalvesareEqual {
    public static void main(String[] args) {
        String s = "textbook";
        String a = new String(s.substring(0,(s.length())/2));
        String b = new String(s.substring((s.length()-1)/2+1,s.length()));
        System.out.println(a);
        System.out.println(b);
        int count1 = checkvowels(a,0,0);
        int count2 = checkvowels(b,0,0);
        if (count1==count2){
            System.out.println("True");
        }else{
            System.out.println("false");
        }



    }

    static int checkvowels(String a,int s,int count){

       while (s<=a.length()-1) {

           if (a.charAt(s) == 'a' || a.charAt(s) == 'e' || a.charAt(s) == 'i' || a.charAt(s) == 'o' || a.charAt(s) == 'u'
                   || a.charAt(s) == 'A' || a.charAt(s) == 'E' || a.charAt(s) == 'I' || a.charAt(s) == 'O' || a.charAt(s) == 'U') {
               count++;

           }
           s++;

       }
       return count;
    }
    }

