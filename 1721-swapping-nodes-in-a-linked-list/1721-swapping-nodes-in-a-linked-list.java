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
    public ListNode swapNodes(ListNode head, int k) {
        k = k-1;
        
        ListNode firstN = head;
        ListNode First = null;
        ListNode Second = null;
        
        while(k > 0){
            firstN = firstN.next;
            k--;
        }
        
        First = firstN;
        Second = head;
        
        while(First.next != null){
            Second = Second.next;
            First = First.next;
        }
        
        int temp = firstN.val;
        firstN.val = Second.val;
        Second.val = temp;
        
        return head;
    }
}