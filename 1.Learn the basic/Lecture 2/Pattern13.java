public class Pattern13 {
    public static void main(String[] args) {
        int rows=6;
        int number=1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
