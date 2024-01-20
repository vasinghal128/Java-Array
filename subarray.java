public class subarray {
    public static void printsub(int numbers[]) {
        int ts = 0;
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k]);
                    sum+=numbers[k];
                }
                if(maxsum<sum){
                    maxsum = sum;
                }
                System.out.println();
                System.out.print("total of this subarray is"+ sum);
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("maximum sum of sub array is"+maxsum);
        System.out.print("total subarray is "+ts);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printsub(numbers);
    }
}
