class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        return files(paths);
    }
    private static List<List<String>> files(String [] arr){
        List<List<String>> res=new ArrayList<>();
        Map<String, List<String>>map=new HashMap<>();
        for(String str:arr){
            String []strarr=str.split(" ");
            String dir=strarr[0];
            for(int i=1;i<strarr.length;i++){
                int indx=strarr[i].indexOf("(");
                String content=strarr[i].substring(indx);
                String filename=dir+"/"+strarr[i].substring(0,indx);
                List<String> files = map.getOrDefault(content,new ArrayList<>());
                files.add(filename);
                map.put(content,files);
            }
        }
        for(String key:map.keySet()){
            if(map.get(key).size()>1){
                res.add(map.get(key));
            }
        }
        return res;
    }
}