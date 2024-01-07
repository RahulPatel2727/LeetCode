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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return merge(list1, list2);
    }
    static ListNode merge(ListNode a, ListNode b){
        var aa = a; var bb = b;
        var list = new ListNode();
        var ans = list;
        while(aa!=null && bb!=null){
            ListNode newNode = null;
            if(aa.val <= bb.val){
                newNode = aa;
                aa = aa.next;
            }else{
                newNode = bb;
                bb = bb.next;
            }
            list.next = newNode;
            list=list.next;
            list.next=null;
        }
        ListNode rem = null;
        if(aa==null){
            rem = bb;
        }else{
            rem = aa;
        }
        list.next = rem;
        return ans.next;
    }
}