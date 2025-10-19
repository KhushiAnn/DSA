public class Pattern19 {
    public static void main(String[] args) {
        int rows=5;
        int initialSpace = 0;
        for(int i=0;i< rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print("*");
            }
          
            for(int j=0;j<initialSpace;j++){
                System.out.print(" ");
            }
          
            for(int j=1;j<=rows-i;j++){
                System.out.print("*");
            }
          
            initialSpace+=2;
          
            System.out.println();
        }
      
        initialSpace = 2*rows -2;
        for(int i=1;i<=rows;i++){
          
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
          
            for(int j=0;j<initialSpace;j++){
                System.out.print(" ");
            }
          
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
          
            initialSpace-=2;
          
            System.out.println();
      }
    }
}
