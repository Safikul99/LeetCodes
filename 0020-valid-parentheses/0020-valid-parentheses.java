class Solution {
    public boolean isValid(String s) {
     Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
            {
               stack.push(ch);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                else
                {
                    char top=stack.peek();
                    if(ch==')' &&top=='(' || ch=='}' && top=='{' || ch==']' && top=='[')
					{
						stack.pop();
					}
					else
					{
						return false;
					}
                }
            }
        }
        return stack.isEmpty();
        
        
    }
}