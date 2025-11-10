public class PrintNto1 {
    // Recursive function to print numbers from current down to 1 using backtracking
    public static void printNumbers(int current) {
        // Base case: if current is less than 1, stop recursion
        if (current < 1)
            return;

        // Recursive call with previous number
        printNumbers(current - 1);

        // Print current number during backtracking
        System.out.print(current + " ");
    }
    public static void main(String[] args) {
        int n = 18;

        printNumbers(n);
        System.out.println();
    }

}
