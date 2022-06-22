class Solution 
{
    public boolean uniqueOccurrences(int[] arr) 
    {
        Arrays.sort(arr);
        Set<Integer> set= new HashSet<>();
        int c=0;
        if(arr.length==2 && arr[0]!=arr[1])
            return false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                c++;
            }
            else{
                if(set.contains(c)){
                    return false;
                }
                set.add(c);
                c=0;
            }
            
        }
        return true;
    }
}