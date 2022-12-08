class Solution {
    public static List<Integer> diffWaysToCompute(String input) {
        List res = new ArrayList();
        int tmp = isNum(input);
        if(tmp >= 0) {
            res.add(tmp);
            return res;
        }
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c == '+' || c == '-' || c == '*') {
                List<Integer> left = diffWaysToCompute(input.substring(0, i));
                List<Integer> right = diffWaysToCompute(input.substring(i+1));
                for(Integer l : left) {
                    for(Integer r : right) {
                        if(c == '+')
                            res.add(l + r);
                        else if(c == '-')
                            res.add(l - r);
                        else
                            res.add(l * r);
                    }
                }
            }
        }
        return res;
    }

    private static int isNum(String s) {
        int res = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!Character.isDigit(c))
                return -1;
            res = res * 10 + c - '0';
        }
        return res;
    }
}