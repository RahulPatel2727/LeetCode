class Solution {
    public int evalRPN(String[] arr) {
        Stack<String> st = new Stack<>();
        String math = "+-/*";
        for (int i=0;i<arr.length;i++){
            String str = arr[i];
            if (math.contains(arr[i]) ) {
                String op = ""+arr[i].charAt(0);
                int b = Integer.parseInt(st.pop());
                int a = Integer.parseInt(st.pop());
                if(op.equals("-")){
                    st.push(""+(a-b));
                }
                else if( op.equals("+")){
                    st.push(""+(a+b));
                }
                else if( op.equals("/")){
                    st.push(""+(a/b));
                }
                else if( op.equals("*")){
                    st.push(""+(a*b));
                }
            }
            else{
                st.push(str);
            }
        }
        return Integer.parseInt(st.peek());
    }
}