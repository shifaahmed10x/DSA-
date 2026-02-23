package TWO_POINTER;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class threeSum {
public static void main(String[] args) {
    int arr[]= {-1,0, 1,2,-1,4};
    List<List<Integer>> result = new ArrayList<>();
    // nlogn
    Arrays.sort(arr); 
    //  
    for(int i =0;i<arr.length-2;i++){  
        if(i>0 && arr[i]==arr[i-1] )
            continue;
        int target = -1 *arr[i];
        int left = i +1;
        int right= arr.length-1;

        while(left <right){
            int sum =arr[left]+ arr[right];
            if(sum== target){
                  result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                  left++;
                  right--;
                while(left< right && arr[left] == arr[left-1]){
                    left++; }
                while (left< right && arr[right]== arr[right+1]) {
                    right--; }
            }
            else if(sum > target){
                   right--;
            }
            else{
                left++;
            }
        }
    }

    System.out.println("Three sum with zero are :");
        for(List<Integer> res : result){
            System.out.println(res);
        }
}
    
}
