//709. To Lower Case
//Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

    class Solution {
        public String toLowerCase(String s) {
          String res = "";
          for(int i = 0;i<s.length();i++)// to traverse along the string s
          {
            char ch = s.charAt(i);// come to the character at i index
            if(ch>='A' && ch<='Z') // check if it is uppcase or not
            {
              res = res + (char)(ch+32);// change it to lowercase witht he formula [a - A = 32]
            }
            else //If the characters are lowercase then no need to update
            {
              res = res + (char)(ch);
            }

          }
            return res;//return the res
        }
    }
