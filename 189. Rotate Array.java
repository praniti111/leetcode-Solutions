class Solution {
    public void rotate(int[] nums, int k) 
    {
        int n = nums.length;
        //to handle larger values of k
        k = k%n;
        
        //to handle negative k
        if(k<0) k = k+n;
        
        //individual reverse  of 1st block
        reverse(nums,0,n-k-1);
        
        //individual reverse of 2nd block
        reverse(nums,n-k,n-1);
        
        //reverse the whole array
        reverse(nums,0,n-1);
         
    }
    
    public static void reverse(int[] nums, int left, int right)
    {
        while(left<right)
        {
            swap(nums,left,right);
            left++;
            right--;
        }
    }
    
    public static void swap(int[] nums, int left, int right)
    {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
