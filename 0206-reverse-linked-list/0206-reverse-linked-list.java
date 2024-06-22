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
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode before = null;
        
        while(current!=null){
            ListNode nextNode=current.next;//almaceno el valor de current.next, porque voy el apuntador next irá hacia before
            current.next=before;
            before=current;
            current=nextNode;
            head=before;
        }
        return head;
    }
}