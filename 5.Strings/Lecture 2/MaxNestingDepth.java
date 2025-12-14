public class MaxNestingDepth {
    public static int maxDepth(String s) {
        int p = 0; 
        int ans = 0; 
        for (char ch : s.toCharArray()) {
            // Increase depth on open parenthesis
            if (ch == '(') p++;
            // Decrease depth on close parenthesis
            else if (ch == ')') p--;
            // Update maximum depth encountered
            ans = Math.max(ans, p);
        }
        return ans; 
    }

    public static void main(String[] args) {
        
        String s = "(1+(2*3)+((8)/4))+1";
        int result = maxDepth(s);
        System.out.println("Max Depth: " + result);
    }
}
