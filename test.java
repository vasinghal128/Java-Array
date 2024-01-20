import java.util.*;
public class test{
    public static void ls(int numbers[]){
        for(int turn =0;turn<numbers.length;turn++){
            for(int j=0;j<numbers.length-1-turn;j++){
                if(numbers[j]>numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]+" ");
        }
    }
    public static void main(String args[]){
        int numbers[] = {5,4,1,3,2};
        ls(numbers);
    }
}