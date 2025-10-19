public class Pattern22 {
    public static void main(String[] args) {
        int rows=4;
        for(int i=0;i<2*rows-1;i++){
         
            for(int j=0;j<2*rows-1;j++){
             
                int top = i;
                int bottom = j;
                int right = (2*rows - 2) - j;
                int left = (2*rows - 2) - i;
             
                System.out.print(rows- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
            }
         
            System.out.println();
        }
    }
}
