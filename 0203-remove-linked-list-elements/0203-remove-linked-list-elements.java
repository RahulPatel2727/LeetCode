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
    public ListNode removeElements(ListNode head, int val) {
//         faltu approtch but it works
        List < Integer> list = new ArrayList<>();
        ListNode temp = head;
        
        while(temp != null){
            list.add(temp.val);
            if(list.contains(val)){
                list.remove(list.indexOf(val));
            }
            temp = temp.next;
        }
        
        if(list.size()==0){
            ListNode res = null;
            return res;
        } 
        
        int i = 0;
        temp = new ListNode(list.get(i));
        i=i+1;
        ListNode res = temp;
        
        while(i<list.size()){
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
            i++;
        }
        return res;
        
        // if(head == null ){
        //     return head;
        // }
        
        // ListNode prenode = null;
        // ListNode temp = head;
        // while(temp!=null || head!=null){
        //     if(head.val == val){
        //         head=head.next;
        //         temp = head;
        //     }
        //     else{
        //         if(temp.val == val){
        //             prenode.next=temp.next;
        //             temp.next=null;
        //             temp = prenode;
        //         }
        //         prenode = temp;
        //         temp=temp.next;
        //     }
        // }
        // return head;
    }
}