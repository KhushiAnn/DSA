public class Pattern9 {
    public static void main(String[] args) {
        int rows=5;
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows-i;j++){
                System.out.print(" ");
            }

            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=rows-1;i>=0;i--){
            for(int j=0;j<rows-i;j++){
                System.out.print(" ");
            }

            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
       }
    }
}
