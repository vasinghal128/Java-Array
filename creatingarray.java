// creating array;

import java.util.Arrays;

public class creatingarray{
    public static void main(String args[]){
        // first method
        int number[] = {1,2,3,4};
        // This method use for print array without loop
        String vaibhav = Arrays.toString(number);
        System.out.println(vaibhav);
        String fruits[] = {"apple","banana"};
        System.out.println(fruits);
        // sconed method
        int marks[] = new int[50]; 
        System.out.println(marks);
    }
}