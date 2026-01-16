package Arrays;

class problem1{
    public static void main(String[] args) {
        int[] arr = {12,34,21,2,53,54,54,43};
        int target =54;
    //METHOD 1 : USE BOOLEAN 
        boolean found = false ;
        
        for(int i=0;i<arr.length;i++){
           if(arr[i] == target){
            found = true;
            System.out.println("Target found at index: "+(i+1));
            break;
           }
        }
        if(!found) 
            System.out.println("Not found");
    //METHOD 2: USE INTEGER
        int find =-1; 
        for(int  i =0;i<arr.length;i++){
            if(arr[i]==target){
                find =i;
                break;
            }
            if(find ==-1) System.out.println("Target not found in array");
            else System.out.println("Target found at index :"+find);
        }
    }

}