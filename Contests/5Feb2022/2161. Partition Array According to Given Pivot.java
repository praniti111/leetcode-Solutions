class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
         
    partition(nums,pivot);
      System.out.print("[");  
    for (int i = 0; i < nums.length; i++) {
        
      //System.out.print(nums[i] + " ");
        
        if(i>0)
        {
            System.out.print(" ");
        }
        System.out.print(nums[i]);
    }
    System.out.print("]");
        System.out.println();
    
   return nums; 
        
    }
    
     public static void partition(int[] arr, int pivot){
    int left = 0, right = 0;
    while(right <arr.length)
    {
    if(arr[right] > pivot) 
    {
      right++;
    }
        else if(arr[right] == pivot)
        {
            
            swap(arr,right, left);
             
        }
        
    else 
    {
      swap(arr,right, left);
      left++;
      right++;
    }
    }
 
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }


}
