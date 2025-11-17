public class LinearSearch {
    public static void main(String[] args) {
        int[] nums={1,6,8,4,9};
        int num=9;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num)
            System.out.println("The number is find at position : " + i);
        }
    }
}
