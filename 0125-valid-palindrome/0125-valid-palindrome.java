class Solution {

  static boolean check( StringBuilder sb,int i,int j)
  {
    if(i>=j)
    return true;
    if(sb.charAt(i)!=sb.charAt(j))
    {
        return false;

    }
    
    return check(sb,i+1,j-1);
  }



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
        return check(sb,0,sb.length()-1);
       
        
    }
}