//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
    }
}
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());

        while (t-- > 0) {
            int n=Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            Node head=new Node(Integer.parseInt(s[0]));
            Node copy=head;
            for(int i=1;i<n;i++){
                Node temp=new Node(Integer.parseInt(s[i]));
                copy.next=temp;
                copy=copy.next;
            }
            Solution ob=new Solution();
            Node ans=ob.modifyTheList(head);
            while(ans!=null){
                out.print(ans.data+" ");
                ans=ans.next;
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public static Node modifyTheList(Node head)
    {
Node rabbit = head, tortoise = head;
        
        while(rabbit.next != null && rabbit.next.next != null){
            tortoise = tortoise.next;
            rabbit = rabbit.next.next;
        }
        
        Node temp = tortoise.next;
        tortoise.next = null;
        
        Node secondHalf = reverse(temp);
        Node cur1 = head;
        Node cur2 = secondHalf;
        
        while(cur1 != null && cur2 != null){
            cur2.data = cur2.data - cur1.data;
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        
        secondHalf =  reverse(secondHalf);
        
        tortoise.next = secondHalf;
        
        return reverse(head);
        

    }
    
    public static Node reverse(Node head){
        if(head == null || head.next == null)
        return head;
        
        Node prev = null;
        Node cur = head;
        
        while(cur != null){
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        
        return prev;
    }
}