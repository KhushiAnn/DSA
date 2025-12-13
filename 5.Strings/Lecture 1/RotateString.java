public class RotateString {
    public static boolean rotateString(String s, String goal) {
        // Check if lengths of both strings are unequal
        if (s.length() != goal.length()) {
            // Return false if lengths don't match
            return false;
        }
        // Concatenate the string with itself
        String doubledS = s + s;
        // Check if the goal is a substring of the concatenated string
        return doubledS.contains(goal);
    }

    public static void main(String[] args) {
        
        System.out.println(rotateString("rotation", "tionrota"));
    }
}
