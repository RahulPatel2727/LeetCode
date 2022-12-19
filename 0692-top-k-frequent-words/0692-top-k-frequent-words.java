class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        return find(words,k);
    }
    public static List<String> find(String [] arr,int k){
        List<String> list = new ArrayList<>();
        Map<String, Integer>map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        String [] el = new String[map.size()];
        int [] frq = new int[map.size()];
        int v = 0;
        for(Map.Entry<String , Integer> mp : map.entrySet()){
            el[v] = mp.getKey();
            frq[v] = mp.getValue();
            v++;
        }
        for(int i =0;i<el.length;i++){
            for(int j=i+1;j<el.length;j++){
                if(frq[i]>frq[j]){
                    int t = frq[i];
                    frq[i] = frq[j];
                    frq[j] = t;
                    String tt = el[i];
                    el[i] = el[j];
                    el[j] = tt;
                }
            }
        }
        for(int i=el.length-1;i>0;i--){
            int p1 = i;
            while(i>0 && frq[i]==frq[i-1]){
                i--;
            }
            if(p1!=i){
                sort(el,i,p1);
            }
        }
        int ind = el.length-1;
        while(k-->0){
            list.add(el[ind]);
            ind--;
        }
        return list;
    }
    public static void sort(String [] arr, int st , int en){
        String  [] temp = new String[en-st+1];
        int ind = st;
        for(int i=0;i<temp.length;i++){
            temp[i] = arr[ind];
            ind++;
        }
        Arrays.sort(temp);
        ind = en;
        for(int i=0;i<temp.length;i++){
            arr[ind] = temp[i];
            ind--;
        }
    }
}