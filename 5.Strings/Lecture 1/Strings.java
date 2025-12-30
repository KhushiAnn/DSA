/*You are given a string s containing both uppercase and lowercase letters. Return an array of unique characters sorted by the following criteria:

1.Primary sorting: Highest to lowest frequency of character occurrence (case-insensitive)

2.Secondary sorting: If two or more characters have the same frequency:
First, group them by case (uppercase characters come before lowercase)

3.Within each case group, sort alphabetically
If the frequency of a character is a prime number, that character should be converted to '*' in the final output
Example: Input: s = "AaaBbbCc" Output: ["*", "*", "*", "*", "*", "*"]

HelloWorld

l:3
o-2
rem:1
loHWerd

uppercase : HW
lowercase : de**r
{"d","e","H","*","*","r","W"}*/

import java.util.*;


public class Strings {
     // Prime check
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static String[] process(String s) {

        // Frequency map (case-insensitive)
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                char key = Character.toLowerCase(c);
                freq.put(key, freq.containsKey(key) ? freq.get(key) + 1 : 1);
            }
        }

        // Unique characters
        List<Character> chars = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c) && !chars.contains(c)) {
                chars.add(c);
            }
        }

        // Manual alphabetical sort
        for (int i = 0; i < chars.size(); i++) {
            for (int j = i + 1; j < chars.size(); j++) {

                char a = chars.get(i);
                char b = chars.get(j);

                // Uppercase first
                if (Character.toLowerCase(a) > Character.toLowerCase(b) ||
                   (Character.toLowerCase(a) == Character.toLowerCase(b)
                    && Character.isLowerCase(a) && Character.isUpperCase(b))) {

                    chars.set(i, b);
                    chars.set(j, a);
                }
            }
        }

        // Build result
        String[] result = new String[chars.size()];
        for (int i = 0; i < chars.size(); i++) {
            char c = chars.get(i);
            int f = freq.get(Character.toLowerCase(c));
            result[i] = isPrime(f) ? "*" : String.valueOf(c);
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "Hello";
        String[] output = process(s);

        System.out.print("{ ");
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
            if (i < output.length - 1) System.out.print(", ");
        }
        System.out.println(" }");
    }
}
