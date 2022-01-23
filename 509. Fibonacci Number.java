class Solution {
    public int fib(int n) 
    {
        int a = 0;
        int b = 1;
        int c;
        int[] arr = new int[n];
        int res = 0;
        
        for(int i = 0; i<n ;i++)
        {
          
            c = a + b;
            arr[i] = a;
            a = b;
            b = c;
            //System.out.print(arr[i]); 
        }
          if(n == 0 )
            {
                res = 0;
            }
          else if(n == 1)
           {
               res = 1;
           }
         else if(n>1 )
            {
                res = arr[n-1] + arr[n-2];
            }
      
        return res;
    }
    
}
