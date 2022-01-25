//83. Remove Duplicates from Sorted Lists
//Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

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
// Here we used dummy node concept to reduce null pointer exception
class Solution
{
  public ListNode deleteDuplicates(ListNode head)
  {
    ListNode dummy = new ListNode(-1);// Create a new Node named dummy and store any data you want 
    ListNode tail  = dummy;// and point the tail pointer to it
    
    while(head!=null)// Run the loop till the head reaches null i.e till head is not null
    {
      if(tail == dummy || head.val != tail.val) //check if the node is the first node then run the condition or check if the head's data is equal to tails data
      {
        tail.next = head;// if yes update the tails add to head ie. update next
        tail = head;// update the tail pointer to head
      }
      head = head.next;// else update the head to the next node
    }
    tail.next = null;// at the end when the head reaches null upadate the tail add to null i.e next =null
    return dummy.next;// return the ll by removing the first  dummy node 
}
}
