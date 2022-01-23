//Book Allocation type

class Solution {
    public int shipWithinDays(int[] weights, int days) 
    {
        int n = weights.length;
        
        int sum = sumOfArray(weights,n);
        int max = maxOfArray(weights,n);
        
        int low = max;
        int high = sum;
        
        int mid = 0;
        int ans = 0;
        
        while(low<=high)
        {
            mid = (low+high)/2;
            
            if(isPossible(weights, days, mid,n)==true)
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
    
    public static int sumOfArray(int[]weights,int n)
    {
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum = sum + weights[i];
        }
        return sum;
    }
    
    public static int maxOfArray(int[]weights, int n)
    {
        int max = 0;
        for(int i=0;i<n;i++)
        {
            max = Math.max(max,weights[i]);
        }
        return max;
    }
    
    public static boolean isPossible(int[]weights, int days, int mid, int n)
    {
        int currStudent = 1;
        int currPages = 0;
        
        for(int i=0;currStudent<=days && i<n;i++)
        {
            if((currPages + weights[i])<=mid)
            {
                currPages = currPages+weights[i];
            }
            else
            {
                currStudent++;
                currPages = weights[i];
            }
        }
        if(currStudent>days)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
