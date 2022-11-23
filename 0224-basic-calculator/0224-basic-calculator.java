class Solution {
    public int calculate(String s) {
        int result = 0,sign = 1;
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(Character.isDigit(ch)){
                int num = 0;
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                num = num * sign;
                sign = 1;
                result += num;
            }else if(ch == '('){
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            }else  if( ch == ')'){
                result *= stack.pop();
                result += stack.pop();
                
            }else if(ch == '+'){
                sign = 1;
            }else if( ch == '-'){
                sign = -1;
            }else{
                continue;
            }
        }
    return result;
    }
}