//82. Remove Duplicates from sorted list II
//Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.
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

//Here we use the dummy node concept to reduce the null pointer exception

class Solution
{
  public ListNode deleteDuplicates(ListNode head)
  {
    ListNode dummy = new ListNode(-1);// Create a new node
    ListNode tail = dummy;// tail points on dummy
    
    while(head!=null)// Run the loop till head is null
    {
      if(head.next == null || head.next.val != head.val)// Check if head's next is null or if the head's next data is same as the head's data
      {
        tail.next = head;// if yes update the tail's add to head
        tail = head;// and the tail ponter to head
        head = head.next;// update the head to next node
      }
      else// if the data values are same for both the node then
      {
        ListNode curr = head;// create a new pointer current place it to the head
        while(curr !=null && curr.val == head.val)//Run the loop till both the curr reaches null or current's data is same as the head's data 
        {
          curr = curr.next;//updte to next 
        } 
        head = curr;//after the loop gets complate it reaches a node where the data  of the head is not same as curr so update the pointer head to curr
      }
      
    }
      tail.next = null;// after the head reaches null update the tail's next to null
      return dummy.next;//and return from dummy's next
  }
}
