import java.util.ArrayList;

public class twoDArraylist {
    public static void main(String[] args) {


        ArrayList<String> fruits = new ArrayList<>();
       fruits.add("Apple");
       fruits.add("Mango");
       fruits.add("banana");

       ArrayList<String> drinks = new ArrayList<>();
       drinks.add("Water");
       drinks.add("Soda");
       drinks.add("Appy");
       drinks.add("Pepsi");

       ArrayList<String> Snacks = new ArrayList<>();
       Snacks.add("Chips");
       Snacks.add("Tacos");

//        System.out.println(fruits);
//        System.out.println(drinks);
//        System.out.println(Snacks);

       ArrayList<ArrayList<String>> All = new ArrayList<>();
       All.add(fruits);
       All.add(drinks);
       All.add(Snacks);
        System.out.println(All);
        System.out.println(All.get(2).get(0));
        drinks.add(1,"Rum");
        System.out.println(All);
    }
}
