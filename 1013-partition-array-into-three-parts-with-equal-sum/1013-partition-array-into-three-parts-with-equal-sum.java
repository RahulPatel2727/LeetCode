class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int i:arr){
            sum += i;
        }
        
        if(sum % 3 != 0)
            return false;
        int one = sum/3;
        int count = 0;
        int temp = 0;
        for(int i:arr){
            temp += i;
            if(one == temp){
                count ++;
                if(count == 3)
                    return true;
                temp = 0;
            }
        }
        return (count == 3);
    }
}