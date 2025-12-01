import java.util.HashSet;
import java.util.Set;

public class MaximumDistinctSubstrings {
    public static int maxDistinct(String s) {
        Set<Character> result= new HashSet<>();
        for(int i=0;i<s.length();i++){
            result.add(s.charAt(i));
        }
        return result.size();
    }

    public static void main(String[] args) {
        String d="abab";
        int result=maxDistinct(d);
        System.out.println("Maximum Substrings with distinct substrings : " +result);

    }
}
