public class SumOfNNumbers {
    static int func(int n){
        
            // Base Condition.
            if(n == 0){
                
                return 0;
            }
            
            // Problem broken down into 2 parts and then combined.
            return n + func(n-1);
            

    }
    public static void main(String[] args) {

       // Here, let’s take the value of n to be 3.
       int n = 10;
       System.out.println(func(n));
    }
}

