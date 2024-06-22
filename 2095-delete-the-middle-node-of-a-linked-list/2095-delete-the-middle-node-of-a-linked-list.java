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
    public ListNode deleteMiddle(ListNode head) {
        int middle=(length(head)/2); //devuelve la posición a eliminar
        ListNode current=head;
        
        for(int i=0;i<middle;i++){
            if(i==middle-1){//nos ubicamos en la posición anterior a la que eliminaré
                current.next=current.next.next;//dejo de referenciar...
                return head;
            }
            current=current.next; //puntero para avanzar en la lista
        }
        //en el caso de que sólo tengamos un elemento en la lista, entoces:
        head = null;
        return head ;
    }
    
    public int length(ListNode pointer){
        int length=0;
        while(pointer!=null){
            pointer=pointer.next;
            length++;
        }
        return length;
    }
}