public class Pattern14 {
    public static void main(String[] args) {
        int rows=5;
        for(int i=0;i<rows;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    
}
