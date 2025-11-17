public class MissingNumber {
    public static int missingNumber(int []arr, int N) {

        int hash[] = new int[N + 1]; //hash array

        // storing the frequencies:
        for (int i = 0; i < N - 1; i++)
            hash[arr[i]]++;

        //checking the freqencies for numbers 1 to N:
        for (int i = 1; i <= N; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }

    public static void main(String args[]) {
        int N = 6;
        int a[] = {1, 2, 4, 5, 6};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }
}
