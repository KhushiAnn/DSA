public class StringRecursion {

    public static String reverseWords(String s){
        String[] words=s.split(" ");
        StringBuilder result= new StringBuilder();

        for(int i=0;i<words.length;i++){
            result.append(recursiveReverseString(words[i]));
            if(i<words.length-1){
                result.append(" ");
            }
        }
        return result.toString();
    }

    private static String recursiveReverseString(String word){
        if(word.length()==1){
            return word;
        }
        return word.charAt(word.length()-1)+ recursiveReverseString(word.substring(0,word.length()-1));
    }
    public static void main(String[] args) {
        String s= "Hello World";
        System.out.println(reverseWords(s));
    }
}
