package SlidingWindow;

public class MinLengthSum {
    public static void main(String[] args) {
        int arr[]={1,2,4,4};
        int left = 0;
        int right = 0;
        int sum = 0;
        int target = 4;
        int min_length = Integer.MAX_VALUE;

        while(right > arr.length){
            sum += arr[right];

            while(sum>= target){
                min_length= Math.min(right-left+1, min_length);
                sum -=arr[left];
                left++;
            }
            right++;
        }
        if(min_length == Integer.MAX_VALUE)
            System.out.println(0);
        else{
            System.out.println("Min Length:"+min_length);
        }
    }
}
