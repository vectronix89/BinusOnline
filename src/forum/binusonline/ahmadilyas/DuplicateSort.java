package forum.binusonline.ahmadilyas;

import java.util.Arrays;

public class DuplicateSort {
    public static void main(String args[]){
        int[] values = {7,2,6,1,4,7,4,5,4,7,7,3,1};
//        System.out.println(cariDuplicateCountsArray(values));
        insertionSort(values);
    }

    public static int cariDuplicateCountsArray(int[] nums) {
        //pengurutan ascending
        Arrays.sort(nums);
        int prev = nums[0];
        int count = 0;
        boolean numAlreadyRepeated = false;
        for(int i = 1; i < nums.length; i++) {
            if(prev == nums[i] && !numAlreadyRepeated) {
                count++;
                numAlreadyRepeated = true;
            } else if(prev != nums[i]) {
                prev = nums[i];
                numAlreadyRepeated = false;
            }
        }
        return count;
    }

    private static void insertionSort(int[] a) {

        // [230, 23, 45, 34, 98]
        for (int j = 0; j < a.length; j++) {

            int key = a[j];
            int i = j - 1;

            while (i > 0 && a[i] > key) {
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = key;
        }

        System.out.println("sorted array: " + Arrays.toString(a));
    }
}
