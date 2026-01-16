package Arrays;

public class move0s {
   public static void nonsort(int[] arr){
        int i = 0;
        int j = arr.length -1;
        
        while(i<=j){
            if(arr[i]==0 && arr[j]!=0){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
                i++;
            }
            else if(arr[i]==0 && arr[j]==0){
                j--;
            }
            else //if(arr[i]!=0)
              i++;
        }
        
         for (int k : arr) {
         System.out.print(k +" " );
      } 
    }
        public static void sorted1(int[] arr){
        int i = 0;
        int j = 0;
        
        while(j < arr.length  ){
            if(arr[j]!=0){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
                j++;
            }
        
         for (int k : arr) {
         System.out.print(k +" " );
      } 
    }
     public static void sorted2(int[] arr){
        int i = 0;
        int j = 0;
        
      while(j != arr.length  )
        { 
            if(arr[i]==0 && arr[j]!=0)
            { 
                int temp =arr[i]; 
                arr[i]=arr[j]; 
                arr[j]=temp; i++; 
            } else if(arr[i]==0 && arr[j]==0)
                { 
                  j++;
                 } 
                 else { 
                 i++; 
                 j++; } }
        
         for (int k : arr) {
         System.out.print(k +" " );
      } 
    }


    

    public static void main(String[] args) {
        int[] arr={1,2,0,4,3,0,5,0};
        sorted2(arr);
    }
}
