package Arrays;

public class reverse_array {
// create new array and copy element
    public static void method1(int[] arr){
           int[] temp= new int[arr.length];
           
           for(int i=0;i<arr.length;i++){
              temp[i] = arr[arr.length -1-i];
           }
           
           for(int ele : temp){
             System.out.print(ele+" ");
           }
    }
// swap element 

    public static void method2(int arr[]){
      int i=0;
      int j=arr.length-1;
      while(i<j){
         swap(arr,i,j);
         i++;
         j--;
        
      }
      for(int k : arr){
            System.out.print(k +" ");
      }

    }
    public static void swap(int[] arr,int i, int j) {
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[]={0,3,9,7,54,2,80};
        method2(arr);


    }
}
