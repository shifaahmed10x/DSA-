package ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class Master {
///////////////////////////////////////////
    static Vector<Integer> AddingOne1(int[] arr) {
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 9) {
                arr[i]++;
                break;
            } else {
                arr[i] = 0;
            }
        }
        Vector<Integer> result = new Vector<>();
        if (arr[0] == 0) {
            result.add(1);
        }
        for (int x : arr) {
            result.add(x);
        }
        return result;

    }
    /////////////////////////////////////////////////////
     static Vector<Integer> AddingOne2(int[] arr) {
        int n = arr.length;
        int carry=1;
        Vector<Integer> ans = new Vector<>();

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i]+carry <= 9) {
                ans.add(arr[i]+carry);
                carry=0;
            } else {
                ans.add(0);
                carry=1;
            }
        }
        if(carry ==1) ans.add(1);
        Collections.reverse(ans);
        return ans;

    }
////////////////////////////////////////////
static Vector<Integer> AddingArray(int[] arr1, int[] arr2) {

    int i = arr1.length - 1;
    int j = arr2.length - 1;
    int carry = 0;

    Vector<Integer> ans = new Vector<>();

    while (i >= 0 || j >= 0 || carry != 0) {
        int sum = carry;

        if (i >= 0) {
            sum += arr1[i];
            i--;
        }

        if (j >= 0) {
            sum += arr2[j];
            j--;
        }

        ans.add(sum % 10);
        carry = sum / 10;
    }

    Collections.reverse(ans);
    return ans;
}

static void MergeSortedArrays(int[] arr1 , int[] arr2){
    int size = arr1.length + arr2.length;
    int[] res = new int[size];

    int i =0 ,j=0 ,k=0;

    while(i<arr1.length &&  j<arr2.length){
        if(arr1[i]< arr2[j])
            res[k++]=arr1[i++];
        else
            res[k++]=arr2[j++];         
    }
        while(i < arr1.length){
            res[k++] =arr1[i++];
        }
        while (j< arr2.length) {
            res[k++] =arr2[j++];  
        }
        for (int l : res) {
            System.out.print(l +" ");
        }
        
}


    public static void main(String[] args) {
        int arr1[] = { 2, 5, 9 };
        int arr2[] ={1,5,10,23,};
        MergeSortedArrays(arr1, arr2);
        //System.out.println(AddingArray(arr1,arr2));
    }
}
