import java.util.ArrayList;

public class ArrayListToIntArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        int[] intArray = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            intArray[i] = arrayList.get(i);
        }

        // Now you have converted the ArrayList<Integer> to an int[]
        // You can use intArray as needed
        for (int num : intArray) {
            System.out.println(num);
        }
    }
}
