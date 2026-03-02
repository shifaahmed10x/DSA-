package SlidingWindow;
// Sliding Window = subarray , sum  
public class MaxSumSizeK {

    public static void main(String[] args) {
    int arr[]={100,200,300,400};
    int k= 2;                    
    
    int sum =0 ;
    int max;

    //caluculate first window sum
    for(int i = 0 ; i<k;i++){
            sum += arr[i];
        }
        max=sum;

    // Slide the window   
    for(int i =k; i< arr.length;i++){
        sum = sum - arr[i-k] + arr[i];

        if(sum>max){
            max=sum;
        }
    }
    System.out.println("max :" +max );
    }
}
