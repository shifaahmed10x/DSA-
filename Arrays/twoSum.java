package Arrays;

public class twoSum {
   
    public static void main(String[] args) {
        int[] arr={1,5,3,65,10,6};
        int target =16;
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("Got the Two sum at index: "+(i+1) +","+(j+1));
                }
             }
        }
    }
}
