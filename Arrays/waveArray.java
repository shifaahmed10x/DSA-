package Arrays;

public class waveArray {
    static void method1(int[] arr){

        for (int i = 0; i < arr.length - 1; i += 2) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }
        for (int j : arr) {
            System.out.print( j +" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 8, 9, 10};
        method1(arr);
    }
}
