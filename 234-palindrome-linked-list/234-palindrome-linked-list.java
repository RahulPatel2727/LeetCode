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
// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         int c=0;
//         ListNode temp = head;
//         while(temp!=null){
//             c++;
//             temp=temp.next;
//         }
//         Stack stc = new Stack();
//         System.out.println(c);
//         return false;
//     }
// }
public class Solution {
public ListNode root;
public boolean isPalindrome(ListNode head) {
    root = head;
    return (head == null) ? true : _isPalindrome(head);
}

public boolean _isPalindrome(ListNode head) {
    boolean flag = true;
    if (head.next != null) {
        flag = _isPalindrome(head.next);
    }
    if (flag && root.val == head.val) {
        root = root.next;
        return true;
    }
    return false;
}}