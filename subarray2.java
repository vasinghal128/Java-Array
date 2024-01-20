public class subarray2 {
    public static void printsub(int numbers[]) {
        int ts = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        // calculate prefix
        for(int i = 1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0;
                sum = start==0 ? prefix[end] : prefix[end]-prefix[start];
                if(maxsum<sum){
                    maxsum = sum;
                }
            }
        }
        System.out.println("maximum sum of sub array is"+maxsum);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printsub(numbers);
    }
}