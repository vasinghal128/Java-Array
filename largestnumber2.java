import java.util.*;
public class largestnumber2 {
    public static int lar(int numbers[]){
        int largest = Integer.MIN_VALUE;// minimum value
        for(int i= 0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,6,5,3};
        int num = lar(numbers);
        System.out.println("largst Element of Array "+ num);
    }
}
