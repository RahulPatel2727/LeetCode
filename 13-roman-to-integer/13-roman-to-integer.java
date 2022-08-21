class Solution {
    public int romanToInt(String s) {
        List <Integer> list = new ArrayList<>();
        int i = 0;
        while(i<s.length()){
            // System.out.print(s.charAt(i)+" ");
            switch (s.charAt(i)){
                case 'I':list.add(1);
                    break;
                case 'V':list.add(5);
                    break;
                case 'X': list.add(10);
                    break;
                case 'L': list.add(50);
                    break;
                case 'C':list.add(100);
                    break;
                case 'D':list.add(500);
                    break;
                case 'M':list.add(1000);
                    break;
            }
            i++;
        }
        if(list.size()==1)
            return list.get(0);
        int sum=0;
        for(int j=0;j<list.size()-1;j++ ){
            if(list.get(j)<list.get(j+1)){
                sum+=list.get(j+1)-list.get(j);
                j++;
            }
            else {
                sum+=list.get(j);
            }
        }
        if(list.get(list.size()-2)>=list.get(list.size()-1)){
            sum+=list.get(list.size()-1);
        }
        return sum;
    }
}