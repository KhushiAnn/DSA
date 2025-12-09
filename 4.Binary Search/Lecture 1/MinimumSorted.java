public class MinimumSorted {
    public static int findMinimum(int[] arr){
        int low =0, high= arr.length-1;

        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]> arr[high]){
                low=mid+1;
            
            }else{
                high=mid;
            }
        }
        return arr[low];
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};

        int result=findMinimum(arr);

        System.out.println("Minimum Element in rotated array : " + result);
    }
}
