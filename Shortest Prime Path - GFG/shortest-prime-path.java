//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Solution
{
    Solution()
    {
        // Every index of prime stores zero or one
        // If prime[i] is zero means i is not a prime
        // If prime[i] is one means i is a prime
        
        
    }
    
    public int shortestPath(int Num1,int Num2){
        // Complete this function using prime array
        return s(Num1, Num2);
    }
    static boolean[] primes = new boolean[10000];
    static {
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; j++) {
                    primes[i * j] = false;
                }
            }
        }
    }

    public static int s(int num1, int num2) {
        if (num1 == num2) {
            return 0;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(num1);
        int steps = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int num = queue.poll();
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k <= 9; k++) {
                        // Skip if the number is not changed
                        if (k == (num / (int) Math.pow(10, j)) % 10) {
                            continue;
                        }
                        int next = num + k * (int) Math.pow(10, j) - (num / (int) Math.pow(10, j)) % 10 * (int) Math.pow(10, j);
                        // Skip if the number has a leading zero or is not prime
                        if (next / 1000 == 0 || !primes[next]) {
                            continue;
                        }
                        if (next == num2) {
                            return steps + 1;
                        }
                        queue.add(next);
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}

//{ Driver Code Starts.
class GFG{
    public static void main(String args[]) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        Solution ob = new Solution();
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int Num1=Integer.parseInt(input_line[0]);
            int Num2=Integer.parseInt(input_line[1]);
            System.out.println(ob.shortestPath(Num1,Num2));
        }
    }
}
// } Driver Code Ends