class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        for(char chr: s.toCharArray()){
            if(chr=='('||chr=='{'||chr=='['){
                st.push(chr);
            }
            else if(st.isEmpty()){
                return false;
            }
            else if(chr==')'&&st.pop()!='('){
                return false;
            }
            else if(chr=='}'&&st.pop()!='{'){
                return false;
            }
            else if(chr==']'&&st.pop()!='['){
                return false;
            }
        }
        return st.isEmpty();
    }
}