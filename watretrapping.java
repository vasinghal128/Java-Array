import java.util.*;
public class watretrapping {
    public static int traprainwater(int hight[] , int width){
        int n = hight.length;
         //claculate left max boundary
        int Leftmax[] = new int[hight.length];
        Leftmax[0] = hight[0];
        for(int i=1 ; i<Leftmax.length;i++){
            Leftmax[i] = Math.max(hight[i] , Leftmax[i-1]);
        }
         //calculate right max boundry
        int rightmax[] = new int[hight.length];
        rightmax[n-1] = hight[n-1];
        for(int j=n-2 ; j>=0;j--){
            rightmax[j] = Math.max(hight[j] , rightmax[j+1]);
        }
         //loop
         int totaltrappedwater = 0;
         for(int k=0;k<n;k++){
            //watrelevel = min(left maxboundry , Right maxboundry)
            int watrelevel = Math.min(Leftmax[k] , rightmax[k]);
            // tarped water = watrelevel - hight*width
            int trappedwater =(watrelevel - hight[k])*width;
            System.out.println(trappedwater);
            totaltrappedwater += trappedwater;
         }
         return totaltrappedwater ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int hight[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.print("Enter your bar width ");
        int width = sc.nextInt();
        System.out.println("Total trapped water is " + traprainwater(hight, width));
    }
}
