public class CountDigits {
    public static void main(String[] args) {
        int num=333752;
        int digits=0;
        while(num>0){
            num=num/10;
            digits++;
        }
        System.out.println(digits);
    }
}
