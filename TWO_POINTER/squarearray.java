package TWO_POINTER;

import java.util.ArrayList;

import Arrays.reverse_array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class squarearray {

    public static ArrayList<Integer> square(int arr[]){
        int n=arr.length;
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();

    // separating negative and positive numbers
        for(int num:arr){
            if(num<0)
                neg.add(num);
            else
                pos.add(num);
        }
    // Case 1: NO NEGATIVE NUMBERS 
    if(neg.size() == 0){
        for(int i=0;i<pos.size();i++){
            pos.set(i,pos.get(i)*pos.get(i));
        }
        return pos;
    }

    // Case 2: NO POSITIVE NUMBERS
    if(pos.size() == 0){
        for(int i=0;i<neg.size();i++){
            neg.set(i,neg.get(i)*neg.get(i));
        }
        Collections.reverse(neg);
        return neg;

    }
    // case 3: MIXED NUMBERS
    ArrayList<Integer> result = new ArrayList<>();  
    int i=neg.size()-1; // pointer for negative numbers
    int j=0; // pointer for positive numbers    
    while(i>=0 && j<pos.size()){
        int negSquare = neg.get(i)*neg.get(i);
        int posSquare = pos.get(j)*pos.get(j);
        if(negSquare < posSquare){
            result.add(negSquare);
            i--;
        }
        else{
            result.add(posSquare);
            j++;
        }


    }
    // if there are remaining negative numbers
    while(i>=0){
        result.add(neg.get(i)*neg.get(i));
        i--;
    }
    // if there are remaining positive numbers
    while(j<pos.size()){
        result.add(pos.get(j)*pos.get(j));
        j++;
    }
    return result;
    }
}
