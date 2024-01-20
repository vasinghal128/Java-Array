public class largestnumber {
    public static int lar(int numbers[],int first){
        for(int i=0;i<numbers.length;i++){
            if(first < numbers[i]){
                first = numbers[i];
            }
        }
        return first;
    }
    public static void main(String args[]){
        int numbers[] = {8};
        int first = numbers[1];
        int largest = lar(numbers, first);
        System.out.println("Largest element is "+ largest);
    }
}
