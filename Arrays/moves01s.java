package Arrays;

public class moves01s {
    static void method1(int arr[]){
        int size= arr.length;
        int count =0;
        for(int i:arr){
            if(i == 1){
                count++;
            }
        }
        for(int i=0;i<size;i++){
            if(i< size - count)
               arr[i]=0;
            else 
                arr[i]=1;
        }
        for(int ele:arr){
            System.out.print(ele + " " );
        }
    }
    static void method2(int[] arr){
// two pointer
     int i=0;
     int n=arr.length;
     int j=n-1;
     while(i<j){
        if(arr[i]==0) i++;
       else if(arr[j]==1) j--;
       else if(arr[i]==1 && arr[j]==0 ){
            arr[i] =0;
            arr[j]=1;
            i++;
            j--;
        }

     }
for(int ele:arr){
            System.out.print(ele + " " );
        }
    }
    public static void main(String[] args) {
        int[] arr={1,0,1,0,1,1,0};
        method2(arr);
    }
}
