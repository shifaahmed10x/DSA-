package TWO_POINTER;
import java.util.*;

public class ClosestThreeSum {
    public static void main(String[] args) {

        int arr[] = {-1, 0, 1, 2, -1, 4};

        int min_diff = Integer.MAX_VALUE;   // store minimum difference from 0
        int new_diff = 0;
        int ressum = 0;
        int target = 20;

        Arrays.sort(arr);   // O(n log n)

        for (int i = 0; i < arr.length - 2; i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                new_diff = Math.abs(sum - target);

                if (new_diff < min_diff) {
                    min_diff = new_diff;
                    ressum = sum;
                }

                if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        System.out.println("Closest Three Sum to Zero is: " + ressum);
    }
}