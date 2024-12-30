public class SlidingWindow {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int K = 3;
        int result = maxSum(A, K);
        System.out.println(result); // Output: 12
    }
    static int maxSum(int[] A, int K) {
        int n = A.length;
        int windowSum = 0,maxSum =Integer.MIN_VALUE , windowStart =0;
        for(int i=0;i<n;i++){
            windowSum += A[i];

            if(i >= K-1){
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= A[windowStart];
                windowStart++;
            }
        }
        return 0;
    }
}
