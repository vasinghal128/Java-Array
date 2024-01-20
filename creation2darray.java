import java.util.*;
public class creation2darray {
    public static boolean search(int matrix[][] , int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.print("Found at cell" + "("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.print("Key not found");
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows ");
        int n = sc.nextInt();
        System.out.print("Enter no. of columms ");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];   // For columms length we use matrix[0].length;
        // For inputs values
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // For print 
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Enter your element you want to be search");
        int key = sc.nextInt();
        search(matrix, key);
    }
}
