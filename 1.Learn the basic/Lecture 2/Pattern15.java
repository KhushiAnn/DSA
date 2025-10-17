public class Pattern15 {
    public static void main(String[] args) {
        int rows=5;
        for(int i=rows-1;i>=0;i--){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    
}
