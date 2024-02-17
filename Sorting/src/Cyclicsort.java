import java.util.Arrays;

public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,};
        int i = 0;
        while (i<arr.length){
            int correct = arr[i] -1;
            if (arr[i] != arr[correct]){
                swap(arr,i,correct);

            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

}
