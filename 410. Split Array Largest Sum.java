class Solution {
    public int splitArray(int[] nums, int m) 
    {
        int n = nums.length;
        int sum = sumOfArray(nums,n);
        int max = maxOfArray(nums,n);
        
        int low = max;
        int high = sum;
        int mid = 0;
        int ans =0;
        
        while(low<=high)
        {
            mid = (low+high)/2;
            
            if(isPossible(nums,m,mid,n)==true)
            {
                ans = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
            
        }
        return ans; 
    }
    
    public static int sumOfArray(int[]nums, int n)
    {
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum = sum + nums[i];
        }
        return sum;
    }
    
    public static int maxOfArray(int[]nums, int n)
    {
        int max = 0;
        for(int i=0;i<n;i++)
        {
        max = Math.max(max,nums[i]);
        }
        return max;
    }
    
    public static boolean isPossible(int[]nums,int m,int mid, int n)
    {
        int currStudent = 1;
        int currPages = 0;
        
        for(int i=0; currStudent<=m && i<n;i++)
        {
            if((currPages + nums[i]) <= mid)
            {
                currPages = currPages+nums[i];
            }
            else
            {
                currStudent++;
                currPages = nums[i];
            }
        }
        if(currStudent > m)
        {
            return false;
        }
        else
        {
            return true;
        }
        
    }
    
}
