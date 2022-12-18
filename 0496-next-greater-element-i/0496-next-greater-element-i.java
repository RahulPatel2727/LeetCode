class Solution {
    public int[] nextGreaterElement(int[] num1, int[] num2) {
        Map<Integer,Integer> ans = neg(num2);
        for(int i=0;i<num1.length;i++){
            num1[i] = ans.get(num1[i]);
        }
        return num1;
    }
    public static Map<Integer,Integer> neg(int [] b){
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer>st = new Stack<>();
        
        for(int i=0;i<b.length;i++){
            while(!st.isEmpty() && b[i] > b[st.peek()]){
                map.put(b[st.pop()],b[i]);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            map.put(b[st.pop()],-1);
        }
        return map;
    }
}