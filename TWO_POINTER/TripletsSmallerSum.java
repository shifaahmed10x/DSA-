package TWO_POINTER;

import java.util.Arrays;

public class TripletsSmallerSum {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
        int left,right;
        int target_sum = 10;
        int ans=0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length-2; i++) {
            left = i+1;
            right = arr.length-1;
            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];

                if(sum >= target_sum){
                    right--;
                }
                else{
                    ans+=(right -left);
                    left++;
                }
            }
        }
   System.out.println(ans);
    }
    
}
