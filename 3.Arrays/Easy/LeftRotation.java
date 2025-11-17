public class LeftRotation {
    public static void leftRotation(int[] nums){
        int temp=nums[0];
        int n= nums.length;
        for(int i=0;i<n-1;i++){
            nums[i]=nums[i+1];
        }
        nums[n-1]=temp;
        System.out.println("Array after rotation ");

        for(int i=0;i<n;i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] nums={1,5,8,19,43,55};
        leftRotation(nums);
    }
}
