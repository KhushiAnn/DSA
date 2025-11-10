public class Print1toN {
   
    // Recursive function to print numbers from current to n
    public static void printNumbers(int current, int n) {
        // Base case: if current exceeds n, stop recursion
        if (current > n)
            return;

        // Print current number
        System.out.print(current + " ");

        // Recursive call with next number
        printNumbers(current + 1, n);
    }


    public static void main(String[] args) {
        int n = 20;

        printNumbers(1, n);
        System.out.println();
    }
}

