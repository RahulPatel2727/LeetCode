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
        if(lists.length==0){
            return null;
        }
        if(lists.length==1){
            return lists[0];
        }

        int it = 0;
        for(int i=0;i<lists.length;i++){  
            if(lists[i]!=null){
                ans = lists[i];
                it = i;
                break;
            }
        }
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