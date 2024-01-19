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
    public ListNode sortList(ListNode head) {
         return mergeSort(head);
    }
    static ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        var mid = mid(head);
        var right = mid.next;
        mid.next = null;
        var left = head;
        left = mergeSort(left);
        right = mergeSort(right);
        return mergeLists(left, right);
    }

    static ListNode mid(ListNode list) {
        var f = list.next;
        var s = list;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    static ListNode mergeLists(ListNode a, ListNode b) {
        var ans = new ListNode();
        var cur = ans;
        while (a != null || b != null) {
            ListNode tepm;
            if (a != null && b != null) {
                if (a.val <= b.val) {
                    tepm = a.next;
                    cur.next = a;
                    a = tepm;
                } else {
                    tepm = b.next;
                    cur.next = b;
                    b = tepm;
                }
            } else if (a != null) {
                tepm = a.next;
                cur.next = a;
                a = tepm;
            } else {
                tepm = b.next;
                cur.next = b;
                b = tepm;
            }
            cur = cur.next;
        }
        return ans.next;
    }
}