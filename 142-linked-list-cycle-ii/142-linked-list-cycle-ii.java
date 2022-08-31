/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;
        HashSet<ListNode> has=new HashSet<>();
        // ArrayList<ListNode> list=new ArrayList<>();
        if(head==null || head.next==null)
            return null;
        else{
            while(head!=null){
                if(has.contains(head))
                    return head;
                else
                    has.add(head);
                head = head.next;
            }
        }
        return null;
    }
}