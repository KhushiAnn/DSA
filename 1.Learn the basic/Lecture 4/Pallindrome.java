public class Pallindrome {
    public static void main(String[] args) {
        int num=12121;
        int reverseNum=0;
        int remainder;
        int n=num;
        while(n!=0){
            remainder=n%10;
            reverseNum=reverseNum*10+remainder;
            n=n/10;
        }
        if(num==reverseNum){
            System.out.println(num + " is Pallindrome");
        }else{
            System.out.println(num + " is not a Pallindrome");
        }
    }
}
