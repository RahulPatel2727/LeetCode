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
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        HashSet<ListNode> has=new HashSet<>();
        if(temp==null||temp.next==null)
            return false;
        else{
            while(temp!=null){
                if(has.contains(temp))
                    return true;
                else
                    has.add(temp);
                temp=temp.next;
            }
        }
        return false;
    }
}