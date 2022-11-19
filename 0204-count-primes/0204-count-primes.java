class Solution {
    public int countPrimes(int n) {
        if(n==0||n==1){
            return 0;
        }
        int c = 0;
        // while()
        return primeSieve(n-1);
    }
    public static int  primeSieve(int n){
        // kisi index pe false se hai us index ko prime conside as prime
        /// kisi index pe true then index ko not prime
        int c = 0;
        boolean [] arr=new boolean[n+1];
        arr[0]=true;
        arr[1]=true;
        for (int i = 2; i < arr.length; i++) {
            if(arr[i]==false){
                for (int j = 2; i*j <= n; j++) {
                    arr[i*j]=true;//making as not prime

                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(!arr[i]){
                c++;
            }
        }
        return c;
    }
}