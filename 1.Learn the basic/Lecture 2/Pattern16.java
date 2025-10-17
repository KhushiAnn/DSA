public class Pattern16 {
        public static void main(String[] args) {
            int rows=6;
            char ch='A';
            for(int i=0;i<rows;i++){
                
                for(int j=0;j<=i;j++){
                    System.out.print(ch + " ");
                }
                System.out.println();
                ch++;

            }
        }
        
    
}
