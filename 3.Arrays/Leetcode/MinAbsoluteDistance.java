import java.util.HashMap;
import java.util.Map;

public class MinAbsoluteDistance {
    private static int reverse(int s){
        int a=0;
        while(s>0){
            a=a*10 +s%10;
            s/=10;
        }
        return a;
    }
    
    public static int minMirrorPairDistance(int[] nums) {
        Map<Integer,Integer> resultMap= new HashMap<>();
        int size= nums.length;
        int resultPairs=size;

        for(int i=0;i<size;i++){
            if(resultMap.containsKey(nums[i])){
                resultPairs=Math.min(resultPairs,i-resultMap.get(nums[i]));
            }
            resultMap.put(reverse(nums[i]),i);
        }
        return (resultPairs<size)? resultPairs : -1;
    }

    public static void main(String[] args) {
        int[] nums={12, 21, 33, 45,54};
        int result=minMirrorPairDistance(nums);
        System.out.println("Minimum Absolute Distance Between Mirror Pairs : " +result);
    }
}
