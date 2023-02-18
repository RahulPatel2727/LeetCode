/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = null;
        int it = 0;
        //finding first not null ll
        for(int i=0;i<lists.length;i++){  
            if(lists[i]!=null){
                ans = lists[i];
                it = i;
                break;
            }
        }
        
        //finding 2nd not null ll and merging it
        for(int i=it+1;i<lists.length;i++){
            ListNode one = lists[i];
            if(one != null){
                ans = merge(ans,one);
            }
        }
        return ans;
    }
    public ListNode merge(ListNode a, ListNode b){
        ListNode ans = new ListNode(0);
        ListNode res = ans;
        while(a!=null && b!=null){
            if(a.val<=b.val){
                ans.next = a;
                a = a.next;
                ans = ans.next;
            }
            else if(a.val > b.val){
                ans.next = b;
                ans = ans.next;
                b = b.next;
            }
        }
        ans.next = (a == null) ? b:a;
        return res.next;
    }
}