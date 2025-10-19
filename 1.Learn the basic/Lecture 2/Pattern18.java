public class Pattern18 {
    public static void main(String[] args) {
        int rows=6;
        for(int i=0;i<rows;i++){
         
          for(char ch =(char)(int)('A'+rows-1-i);ch<=(char)(int)('A'+rows-1);ch++){
              
              System.out.print(ch + " ");
          }
        
          System.out.println();
      }
    }
}
