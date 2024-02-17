import java.util.Arrays;

public class passinginFunction {
    public static void main(String[] args) {
        int[] nums = {3,4,3,2};
        System.out.println(Arrays.toString(nums));
        call(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void call(int[] arr){
        arr[0] = 88;
    }
}
