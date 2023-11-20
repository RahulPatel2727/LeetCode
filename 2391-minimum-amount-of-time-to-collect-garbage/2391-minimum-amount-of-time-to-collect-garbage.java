class Solution {
    public int garbageCollection(String[] ga, int[] t) {
        int ans = 0;
        for(int i=1;i<t.length;i++){
            t[i] = t[i] + t[i-1];
        }
        int gn = ga.length;
        int []m = new int[gn];
        int mc =0;
        int []p = new int[gn];
        int pc = 0;
        int []g = new int[gn];
        int gc = 0;
        
        for(int i=0;i<gn;i++){
            int cm=0, cp=0, cg=0;
            for(char it : ga[i].toCharArray()){
                if(it=='M'){
                    cm++;
                }else if(it=='P'){
                    cp++;
                }else{
                    cg++;
                }
            }
            m[i] = cm; mc += cm;
            p[i] = cp; pc += cp;
            g[i] = cg; gc += cg;
        }
        
        // System.out.println(Arrays.toString(t));
        // System.out.println(Arrays.toString(m));
        // System.out.println(Arrays.toString(p));
        // System.out.println(Arrays.toString(g));
        // System.out.println(mc+" "+pc+" "+gc);
        
        int rd = 0;
        int count = 0;
        for(int im = gn-1;im>=0;im--){
            if(im!=0 && m[im]!=0){
                rd = t[im-1];
                break;
            }
        }
        ans += mc + rd;
        rd = 0;
        
        for(int ip=gn-1;ip>=0;ip--){
            if(ip!=0 && p[ip]!=0){
                rd = t[ip-1];
                break;
            }
        }
        ans+=pc+rd;
        rd = 0;
        
        for(int ig=gn-1;ig>=0;ig--){
            if(ig!=0 && g[ig]!=0){
                rd = t[ig-1];
                break;
            }
        }
        ans += gc + rd;
        return ans;
        
    }
}