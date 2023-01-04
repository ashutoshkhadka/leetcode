import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Tester {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i],1);
            }
        }
        return false;
    }

    public static int[] rotate2(int[] nums, int k) {
        nums = reverse(nums, 0, nums.length-1);
        nums = reverse(nums, 0 , k-1);
        nums = reverse(nums, k, nums.length-1);
        return nums;
    }


    private static int[] reverse(int[] nums, int start, int end) {
        int tmp ;
        while ( start < end) {
            tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end --;
        }
        return nums;
    }
}

//  public void rotate(int[] arr, int k) {
//
//        k = k%arr.length;
//        reverseArray(0 ,  arr.length-1 ,  arr);
//	    reverseArray(0 ,  k-1 ,  arr);
//	    reverseArray(k,  arr.length-1 ,  arr);
//
//        System.out.println(arr);
//
//
//
//    }
//
//    public static void  reverseArray(int i , int j , int[] arr){
//
//	    while(i<j){
//
//
//	        int temp = arr[i];
//	        arr[i] = arr[j];
//	        arr[j]= temp;
//
//	        i++;
//	        j--;
//
//	    }
//
//
//
//
//	}
