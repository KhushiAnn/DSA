public class Pattern20 {
    public static void main(String[] args) {
        int rows=4;
        int spaces = 2*rows-2;
      
        for(int i = 1;i<=2*rows-1;i++){
          
            int stars = i;
          
            if(i>rows){
                stars = 2*rows - i;
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
          
            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }
          
            for(int j = 1;j<=stars;j++){
                System.out.print("*");
            }
          
            System.out.println();
            if(i<rows){ 
                spaces -=2;
            }else {
                spaces +=2;
            }
      }
    }
}
