public class SquareRoot1 {

    public static int squareRoot(int n){
        int sqroot=0;
        if(n<2){
            return n;
        }

        int left=1, right=n/2;

        while(left<=right){
            long mid= left+ (right - left)/2;

            if(mid*mid <= n){
                sqroot=(int) mid;
                left=(int) mid + 1;
            }else{
                right=(int) mid -1;
            }
        }
        return sqroot;
    }
    public static void main(String[] args) {
        int n=10100;
        int result =squareRoot(n);
        System.out.println("Square root is : " + result);
    }
}
