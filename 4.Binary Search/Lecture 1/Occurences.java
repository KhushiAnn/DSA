public class Occurences {
    
    public static int countOccurences(int[] arr , int k){
        int n=arr.length;
        int result=0;
        int left=0, right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>=k){
                right=mid;
                for(int i=left;i<right;i++){
                    if(arr[i]==k){
                        result++;
                    }
                }
            }else{
                left=mid+1;
                for(int i=left;i<right;i++){
                    if(arr[i]==k){
                        result++;
                    }
                }
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,4,7,7,7,7,8};
        int k=7;
        int totalOccurences=countOccurences(arr,k);
        System.out.println("The number of occurences is : " + totalOccurences);
    }
}
