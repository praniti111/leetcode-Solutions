class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        //Two pointer solution
        int left = 0, right = numbers.length-1;
        while(left<right)
        {
            int sum = numbers[left] + numbers[right];
            
            if(sum == target) 
            {
                return new int[]{left+1, right+1};// as it need the indexing to start from 1
            }
            if(sum >target)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return null;
        
        
    }
}
