package Recursion.src.RecursionArray;

import java.util.ArrayList;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {1,2,49,4,4,3};
        int target = 4;
        System.out.println(findAllindex(arr,target,0,new ArrayList<>()));

        System.out.println(findindex(arr,target,0));
    }
    static int findindex(int[] arr, int target, int index)
    {
        if(index==arr.length){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }else {
            return findindex(arr,target,index+1);
        }

    }
    static ArrayList<Integer> findAllindex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
       return findAllindex(arr,target,index+1,list);
    }
}
