public class ReverseNumber {
    public static void main(String[] args) {
        int n=-214785638;
        int reverseNum=0;
        int remainder;

        while(n!=0){
            if((reverseNum>Integer.MAX_VALUE/10)|| (reverseNum<Integer.MIN_VALUE/10)){
                System.out.println(0);     
                return;      
            }
            remainder=n%10;
            reverseNum=reverseNum*10+remainder;
            
            n=n/10;
        }
        System.out.println("Reversed Number : "+ reverseNum);
    }
}
