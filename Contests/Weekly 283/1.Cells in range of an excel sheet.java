class Solution {
    public List<String> cellsInRange(String s) {
        
        List <String> res =new ArrayList<String>();
     char startAlphabet=s.charAt(0);
     char endAlphabet=s.charAt(3);
     int startIndex=Integer.parseInt(s.charAt(1)+"");
     int endIndex=Integer.parseInt(s.charAt(4)+"");
        
        for(char start=startAlphabet; start<=endAlphabet; start++)
        {
            for(int i=startIndex; i<=endIndex; i++)
            {
                String ele=start+""+i;
                res.add(ele);
            }
        }
        return res;
    
    }
}
