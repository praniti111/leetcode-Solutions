class Solution {
    public int reverse(int x) 
    {
        int rem = 0;
        int lastDigit =0;
        
        while(x!=0)
        {
            lastDigit = x%10;
            int newdigit = rem*10 + lastDigit;
            
            if((newdigit-lastDigit)/10 != rem)
            {
                return 0;
            }
            
            
            x =x/10;
            rem = newdigit;
            
        } 
        return rem;
      
    }
}
