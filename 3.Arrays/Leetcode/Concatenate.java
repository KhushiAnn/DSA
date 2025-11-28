public class Concatenate {
    public static long sumAndMultiply(int n) {
        String a=Integer.toString(n);
        long sum=0;
        long finalResult=0;
        for(int i=0;i<a.length();i++){
            int b=a.charAt(i) - '0';
            if(b>0){
                sum+=b;
                finalResult = finalResult*10+b;
            }
        }
        return sum*finalResult;
    }

    public static void main(String[] args) {
        int n=10203040;
        long finalResult=sumAndMultiply(n);
        System.out.println("Concatenated Non-Zero Digits and Multiply by sum : " + finalResult);
    }
}
