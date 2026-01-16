package Arrays;

public class secondMax {
    public static int method1(int arr[]){
        int max =Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>sec && arr[i] !=max) 
                sec=arr[i];
        }
        return sec;
    }

    public static int method2(int[] arr){
        int max =Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;

        if(arr.length<2) return -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                sec=max;
                max =arr[i];
            }
            else if(arr[i]>sec && arr[i]!=max){
                sec=arr[i];
            }
        }

        if(sec == Integer.MIN_VALUE) return -1;
        else return sec;
    }


public static void main(String[] args) {
    int[] arr= {12,34,32,34,2,5};
    int res2=method2(arr);
    System.out.println(res2);

}    
}
