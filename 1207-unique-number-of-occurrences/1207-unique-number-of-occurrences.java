class Solution 
{
    public boolean uniqueOccurrences(int[] arr) 
    {
        Arrays.sort(arr);
        Set<Integer> set= new HashSet<>();
        int c=1;
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
                c=1;
            }
            
        }
        // if(arr[arr.length-1]!=arr[arr.length-2]){
        //     // set.add(1);
        //     return !set.contains(1);
        // }
        return true;
    }
}