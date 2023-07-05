class Solution {
    public int minimizeXor(int num1, int num2) {
        int a=0,b=0,n=num1;
        //count bits of num1
        while(num1>0)
        {
            num1&=(num1-1);
            a+=1;
        }
        //count bits of num2
        while(num2>0)
        {
            num2&=(num2-1);
            b+=1;
        }
        if(a==b)return n;
        else if(a<b)
        {
            int rem=b-a;
            String s=Integer.toBinaryString(n);
            while(s.length()!=32)s='0'+s;
            char ch[]=new char[s.length()];
            Arrays.fill(ch,'0');
            for(int i=s.length()-1;i>=0;i--)
            {
                if(s.charAt(i)=='0')
                {
                    ch[i]='1';
                    rem-=1;
                }
                if(rem==0)break;
            }
            String sb=new String(ch);
            int add=Integer.parseInt(sb,2);
            return (n+add);
        }
        else
        {
            int rem=b;
            String s=Integer.toBinaryString(n);
            while(s.length()!=32)s='0'+s;
            char ch[]=new char[s.length()];
            Arrays.fill(ch,'0');
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='1')
                {
                    ch[i]='1';
                    rem-=1;
                }
                if(rem==0)break;
            }
            String sb=new String(ch);
            return Integer.parseInt(sb,2);
        }
    }
}