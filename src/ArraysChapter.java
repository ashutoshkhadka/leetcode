import jdk.jshell.execution.JdiDefaultExecutionControl;

import java.util.*;

public class ArraysChapter {

    public int removeDuplicates(int nums[]) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        int lowestPrice = prices[0];
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] < prices[i]) {
                profit += prices[i] - lowestPrice;
                lowestPrice = prices[i + 1];
            } else {
                if (((prices.length - 2) == i)) {
                    profit += prices[i + 1] - lowestPrice;
                }
            }
        }
        return profit;
    }

    public int maxProfit2(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public int[] rotateTBD(int[] nums, int k) {
        int[] outputArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i + k < outputArray.length) {
                outputArray[(i + k) % nums.length] = nums[i];
            } else if (i + k == outputArray.length) {
                outputArray[0] = nums[i];
            } else {
                outputArray[(i + k) - outputArray.length] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = outputArray[i];
        }
        return nums;
    }

    public int[] rotate(int[] nums, int k) {
        int tmp[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            tmp[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = tmp[i];
        }
        return nums;
    }

    public int[] rotate2(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        return nums;
    }

    private int[] reverse(int[] nums, int start, int end) {
        int tmp;
        while (start < end) {
            tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
        return nums;
    }

    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], 1);
            }
        }
        return false;
    }

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) return key;
        }
        return -1;
    }

    public int singleNumberXOR(int[] nums) {
        int uniqNum = 0;
        for (int idx : nums) {
            uniqNum ^= idx;
        }
        return uniqNum;
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> output = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                output.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] arrOutput = new int[output.size()];
        int k = 0;
        for (int i : output) {
            arrOutput[k++] = i;
        }
        return arrOutput;
    }

    // 9 == 10
    // 99 == 100

    /*
        Best solution with 0ms :D
     */
    public int[] plusOne(int[] digits) {
        int lastIndex = digits.length - 1;
        while (digits[lastIndex] == 9) {
            digits[lastIndex] = 0;
            lastIndex--;
            if (lastIndex == -1) {
                int[] output = new int[digits.length + 1];
                int j = 0;
                output[j++] = 1;
                for (int n : digits) {
                    output[j++] = n;
                }
                return output;
            }
        }
        digits[lastIndex] += 1;
        return digits;
    }

    public int[] moveZeroes(int[] nums) {
        int i = 0;
        int j = 1;
        while (j < nums.length && nums.length > 1) {
            if (nums[i] != 0) {
                i++;
                j++;
            } else {
                if (nums[j] == 0) {
                    j++;
                } else {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                    i++;
                    j++;
                }
            }
        }
        return nums;
    }

    public int[] moveZeroes2(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }

        return nums;
    }

    //   0 1 0 3 12
    //
    //

    public static void main(String[] args) {
    }

}
