class Solution {
    public void reverseString(char[] s) 
    {
        int a_pointer =0;
        int b_pointer = s.length-1;//no parenthesis as it is an array
        
        while(a_pointer<=b_pointer)
        {
            char temp = s[a_pointer];
            s[a_pointer] = s[b_pointer];
            s[b_pointer] = temp;
            
            a_pointer++;
            b_pointer--;
        }
        
    }
}
