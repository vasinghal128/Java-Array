public class subarraykadan {
    public static void kadansub(int n[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0;i<n.length;i++){
            cs+=n[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
            }
    System.out.println("our max subarray is"+ms);
    }
    
    public static void main(String args[]){
        int n[] = {-2,-3,4,9,2,-8,-5,-3};
        kadansub(n);
    }   
}
