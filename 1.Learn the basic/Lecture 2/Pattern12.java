public class Pattern12 {
    public static void main(String[] args) {
        int rows=6;
        int spaces = 2*(rows-1);
        for(int i=1;i<=rows;i++){
          
          
          for(int j=1;j<=i;j++){
          System.out.print(j);
          }
          
          for(int j = 1;j<=spaces;j++){
          System.out.print(" ");
          }
          
          for(int j=i;j>=1;j--){
           System.out.print(j);
          }
          
          System.out.println();
          
          spaces-=2;
      }
    }
    
}
