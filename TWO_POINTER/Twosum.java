package TWO_POINTER;

import java.util.Arrays;

class TwoSum {
    public static void main(String[]args) {

        int[] arr = {10,7,2,15};
        int target =9;
        int left = 0;
        int right = arr.length -1;  
        Arrays.sort(arr); 
       while(left < right) {
        if(arr[left] + arr[right]  == target) {
            System.out.println("Found pair: " + arr[left] + " and " + arr[right]);
            break;
        } else if(arr[left] + arr[right] < target) {
            left++;
        } else if(arr[left] + arr[right] > target) {
            right--;
        }
        else {
            System.out.println("No pair found that sums to " + target);
            break;
        }
       }
    } 
    
}
