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
    public void reorderList(ListNode head) {
        ArrayList<ListNode>list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp);
            temp = temp.next;
        }
        
        temp = new ListNode();
        ListNode res = temp;
        int st = 0, en = list.size()-1;
        while(st<=en){
            temp.next = list.get(st);
            temp = temp.next;
            temp.next = list.get(en);
            temp = temp.next;
            st++;en--;
        }
        temp.next = null;
        head = res.next;
    }
}