public class SumOfAllSubArray {
    public static void main(String[] args) {

        int[] A = {1, 2, 3};
        int K = 3;
        int total = 0;
        totalSum(A, K);
        System.out.println(total);
    }

    static int totalSum(int[] A, int K) {
        int totalSum = 0;
        for (int j = 0; j < K; j++) {

            int n = A.length;
            int windowSum = 0, maxSum = Integer.MIN_VALUE, windowStart = 0;
            for (int i = 0; i < n; i++) {
                windowSum += A[i];

                if (i >= j - 1) {
                    totalSum += windowSum;
                    windowSum -= A[windowStart];
                    windowStart++;
                }
            }
        }
        return totalSum;
    }

}

