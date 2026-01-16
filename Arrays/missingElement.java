package Arrays;

public class missingElement {
    public static int missingNum(int arr[]) {
        int n=arr.length +1;
        long sum= (long) n * (n+1)/2;
        long arrsum=0;
        for(int ele:arr){
           arrsum +=ele; 
        }
        return (int)(sum -arrsum);
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        System.out.println(missingNum(arr));
    }
}
    
