package TWO_POINTER;
class duplicates {

    public static void main(String[] args) {
    int arr[]={1,1,2,2,3,3,4,4};
    int i =0;
    int j=1;

    while(j<arr.length){
       if(arr[j]==arr[j-1] || arr[j]==arr[i]){
        j++;
       }
       else{
        arr[i+1]=arr[j];
        i++;
        j++;
       }
    }
    for(int k=0;k<=i;k++){
        System.out.print(arr[k]+" ");
    }

    
}
}
