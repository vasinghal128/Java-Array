import java.util.*;
public class serchinsortedarray {
    public static boolean sortedserch(int arr[][] , int key){
        int row =0 ; 
        int col = arr[0].length-1;
        int rowl = arr.length-1;
        int coll = 0;
        //top
        // while(row<arr.length && col>=0){
        //     if(arr[row][col]==key){
                
        //         System.out.print("fount at cell (" + row + "," + col + ")");
        //         return true;
        //     }
        //     else if(key<arr[row][col]){
        //         col--;
        //     }
        //     else{
        //         row++;
        //     }
        // }
        // bottom
        while(rowl>=0 && coll<=col){
            if(arr[rowl][coll]==key){
                System.out.println("fount at cell (" + rowl + "," + coll + ")");
                return true;
            }
            else if(key<arr[rowl][coll]){
                rowl--;
            }   
            else{
                coll++;
            }
        }
        System.out.println("key not found");
        return false;
    } 
    public static void main(String args[]){
        int arr[][] = {{10,20,30,40},
                       {15,25,35,45},
                       {27,29,37,48},
                       {32,33,39,50}};
        int key = 37;
        sortedserch(arr, key);
    }
}
