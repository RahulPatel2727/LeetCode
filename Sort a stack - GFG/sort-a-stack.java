//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/

class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		int[]arr=new int[s.size()];
		for(int i=0;i<arr.length;i++){
		    arr[i]=s.pop();
		}
		
		for(int i=0;i<arr.length;i++){
		    for(int j=i;j<arr.length;j++){
		        if(arr[i]>arr[j]){
		            int t = arr[i];
		            arr[i] = arr[j];
		            arr[j] = t;
		        }
		    }
		}
		for(int i:arr){
		    s.push(i);
		}
		return s;
		
	}
	
}