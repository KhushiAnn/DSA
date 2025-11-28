import java.util.*;
public class MaximumBalancedXOR {
    public static int maxBalancedSubarray(int[] nums) {
        Map<String, Integer> map= new HashMap<>();
        map.put("0,0",-1);
        int len=0, count=0;
        int prefixXor=0;
        for(int i=0;i<nums.length;i++){
            prefixXor^=nums[i];
            if(nums[i]%2==0)
                count++;
            else
                count--;

            String a=prefixXor+ "," + count;
            if(map.containsKey(a)){
                int value=map.get(a);
                len=Math.max(len,i-value);
            
            }
            else 
                map.put(a,i);
        }
        return len;
    }

    public static void main(String[] args) {
        int[] nums={3,1,3,2,0};
        int subarrayLen=maxBalancedSubarray(nums);
        System.out.println("Maximum Balanced XOR Subarray Length : " + subarrayLen);
    }
}
