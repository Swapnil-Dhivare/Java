public class Array {
    public static void main(String[] args) {
         int[] arr = new int[2];          // declaration of array. arr is getting defined in the stack
        //arr = new int[5];   // initialisation: actually here object is being created in the memory (heap)

//        int[] arr = {2,3,4,3,2};  // or we can define the value directly as such
        arr = new int[]{2, 3};

        System.out.println(arr[2]);
        arr[2] = 8;
        System.out.println(arr[2]);
    }


}