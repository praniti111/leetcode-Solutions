//328. Odd Even Linked List
//Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

// The first node is considered odd, and the second node is even, and so on.

// Note that the relative order inside both the even and odd groups should remain as it was in the input.

//Note that this arrangement is asked based on indexs and not values

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
    public ListNode oddEvenList(ListNode head) {
      
    ListNode firstHead = new ListNode(-1);//Create two dummy nodes firstHead and secondHead
    ListNode secondHead = new ListNode(-1);
    ListNode first = firstHead, second = secondHead;// point the tails first and second to the dummy nodes
    
    while(head!=null)// same code as unfold the ll we just have to not reverse the second block
    {
      first.next = head;
      first = head;
      head = head.next;
      
      if(head!=null)
      {
      second.next = head;
      second = head;
      head = head.next;
      }
    }
    second.next = null;
    first.next = secondHead.next;// Dirctly point the first tail to second blocks second node as first node is -1
    return firstHead.next;// return the ll from firstHead.next as the first node in first Block is -1
  }
   
    }
