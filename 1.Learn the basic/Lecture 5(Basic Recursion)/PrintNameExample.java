public class PrintNameExample {

    public static void printName(String name, int count, int N) {
        // Base case: if count equals N, stop recursion
        if (count == N)
            return;

        // Print the name
        System.out.println(name);

        // Recursive call with incremented count
        printName(name, count + 1, N);
    }
    public static void main(String[] args) {
        int N = 7;
        String name = "Ritwik";

        printName(name, 0, N);
    }
}