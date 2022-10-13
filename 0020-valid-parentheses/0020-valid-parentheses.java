class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<Character>();
        
        try{
            for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            
            if(ch=='(' || ch=='{' || ch=='[')
            {
                stack.push(ch);
            }
            else {
                char temp = stack.peek();
                if(stack.size() >0 && 
                   ( (ch==')' && temp=='(' )
                    || (ch=='}' && temp=='{' ) 
                    || (ch==']' && temp=='[') ) )
                {
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            
        }
        
        }catch(Exception e)
        {
            return false;
        }
            
            
            
            
        return stack.size()==0 ? true : false;
        
        
        
        
        
        
        
    }
}