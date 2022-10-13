/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode nextnode = node.next;
        node.val = nextnode.val;
        node.next = nextnode.next;
        nextnode.next=null;
    }
}