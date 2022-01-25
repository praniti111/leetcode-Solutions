//143. Reorder List
//Input: head = [1,2,3,4,5]
//Output: [1,5,2,4,3]

//Approach : 1. Find middle 
//               2. Second last from mid reverse
//               3. Add the alternate nodes (add 1 and 2) alternativly

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

  public ListNode getMiddle(ListNode head)//Code to get the mid of the ll
  {
    ListNode slow = head, fast =head, prev =null;
    while(fast!=null && fast.next!=null)
    {
      prev = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    if(fast==null) return prev;// for even no. of ll return prev if odd return slow
    return slow;
  }
  
  public ListNode reverse(ListNode head)// Code to get the reverse of the second half after mid
  {
    ListNode curr = head, prev = null;
    while(curr!=null)// run the loop till curr is null
    {
      ListNode ahead = curr.next;
      curr.next = prev;
      prev = curr;
      curr = ahead;
    }
    return prev;
  }
  
  public ListNode reorderList(ListNode head)// Reorder list 
  {
    ListNode mid = getMiddle(head);// mid to get the mid of the ll
    ListNode second = reverse(mid.next);// reverse the second half of the ll
    mid.next = null;// put null after the mid so as to get 2 different ll
    
    ListNode dummy = new ListNode(-1);// get the dummy node
    ListNode tail = dummy;
    
    while(head!=null || second!=null)// Run the loop till head of first block or head of second block are null
    {
      if(head!=null)// check if head of 1st block is null if yes then update the tail and head as done
      {
        tail.next = head;
        tail = head;
        head = head.next;
      }
      if(second!=null)// check if head of 2nd block is null if yes then update the tail and head as done
      {
        tail.next = second;
        tail = second;
        second = second.next;
      }
    }
    tail.next = null;// after both the blocks have reached null then point the last nodes add to null
    return dummy.next;// and return from the dummy's next node
  }
}
        
    
