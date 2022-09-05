/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int s=1,e=n,m=s+(e-s)/2;
        while(s<=e){
            if(isBadVersion(m)){
                e=m-1;
                m=s+(e-s)/2;
            }
            else{
                s=m+1;
                m=s+(e-s)/2;
            }
        }
        return m;
    }
}