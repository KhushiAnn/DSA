public class LongestSubarray {
    public static int maxLen(int[] arr)
    {
        int n=arr.length;
        int sizeOfLongestSubarray=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                if(arr[j]==0){
                    sum+= -1;
                }else{
                    sum+=1;
                }
                if(sum==0){
                    sizeOfLongestSubarray= Math.max(sizeOfLongestSubarray, j-i+1);
                }
            }
            
        }
        return sizeOfLongestSubarray;

    }
    public static void main(String[] args) {
        int[] arr={0,1,1,0,1};
        int k= maxLen(arr);
        System.out.println("The size of longest Subarray is " + k );

    }
}


  
