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
    public ListNode reverseKGroup(ListNode head, int k) {
        
   
        ListNode temp = head;
        
       
        ListNode prevLast = null;
        
       
        while (temp != null) {
            
            
             ListNode kThNode = getKthNode(temp, k);
           
            if (kThNode == null) {
                if (prevLast != null) {
                    prevLast.next = temp;
                }
                
               
                break;
            }
           
            ListNode nextNode = kThNode.next;
            
            kThNode.next = null;
            reverseLinkedList(temp);
            if (temp == head) {
                head = kThNode;
            } else {
                prevLast.next = kThNode;
            }
            prevLast = temp;
            temp = nextNode;
        }
        return head;
    
    }
    static ListNode reverseLinkedList(ListNode head) {
        ListNode temp = head;  
       ListNode prev = null;  
       while(temp != null){  
           ListNode front = temp.next;  
           temp.next = prev;  
           prev = temp;  
           temp = front; 
       }
       return prev;  
    }
    static ListNode getKthNode(ListNode temp, int k) {
        k -= 1;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }
}