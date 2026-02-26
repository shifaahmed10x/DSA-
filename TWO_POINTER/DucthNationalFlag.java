package TWO_POINTER;
class DucthNationalFlag{
 public static void main(String[] args) {
    int arr[]= {2,1,0,0,2,1,1};
    int low=0;
    int mid =0;
    int high = arr.length -1;
        while(mid <= high){
        if(arr[mid]==0){
          swap(mid,low,arr);
          mid++;
          low++;
        }
        else if(arr[mid] == 1){
            mid++;
        }
        else{
            swap(mid,high,arr);
            high--;
        }
    }
    for (int k : arr) {
        System.out.print(k +" ");
    }
   
 }

 private static void swap(int i, int j,int arr[]) {
    int temp = arr[i];
    arr[i]= arr[j];
    arr[j]= temp;
 }
}