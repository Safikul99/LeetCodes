class Solution {
    public boolean isPalindrome(String s) 
    {
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>=97 && s.charAt(i)<=122) || (s.charAt(i)>=48 && s.charAt(i)<=57))
            {
                sb.append(s.charAt(i));
            }

        }
        int i=0,j=sb.length()-1;
        while(i<=j)
        {
            if(sb.charAt(i)!=sb.charAt(j))
            {
                return false;
               
            }
             i++;
             j--;
        }
        
        return true;
        
    }
}