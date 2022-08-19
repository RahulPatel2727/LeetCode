class Solution {
    public int minSetSize(int[] arr) {
        Arrays.sort(arr);
        List<Integer>list=new ArrayList<>();
        int c=1;
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                c++;
            }
            else{
                list.add(c);
                c=1;
            }
        }
        // if(arr[arr.length-1]!=arr[arr.length-2])
        list.add(c);
        int size=arr.length;
        Collections.sort(list);
        int sum=0,count=0;

        for(int i=list.size()-1;i>=0;i--){
            sum+=list.get(i);count++;
            if(sum>=size/2)
                return count;
        }
        // System.out.println(list);
        return 1;
    }
}