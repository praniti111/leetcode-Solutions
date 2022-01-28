//206. Reverse Linkedlist
//Given the head of a singly linked list, reverse the list, and return the reversed list.

class Solution
{
  public ListNode reverseList(ListNode head)
  {
    ListNode curr = head, prev =null;
    
    while(curr!=null)
    {
      ListNode ahead = curr.next;
      curr.next = prev;
      prev = curr;
      curr = ahead;
    }
    return prev;
  }
}
