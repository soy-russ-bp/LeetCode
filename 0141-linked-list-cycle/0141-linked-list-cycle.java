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
        ListNode liebre = head;
        ListNode tortuga = head;
        
        while (liebre != null && liebre.next != null) {
            liebre = liebre.next.next;
            tortuga = tortuga.next;
            
            if (tortuga == liebre) {
                return true;
            }
        }
        
        return false;
    }
}
