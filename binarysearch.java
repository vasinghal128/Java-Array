import java.util.*;
public class binarysearch {
    public static int bs(int numbers[],int key){
        int start = 0, end = numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            //comperison
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start= mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your key: ");
        int key = sc.nextInt();
        System.out.println("index for "+key+" is "+bs(numbers, key));

    }
}
