
public class ReverseRecursion {
	private class ListNode 
	{
		int data;
		ListNode next;
		
		ListNode(int data)
		{
			this.data = data;
			next = null;
		}
	}
	
	ListNode head;
	
	
	public void listCreation()
	{
		System.out.println("hello");
		head = new ListNode(10);
		ListNode node1 = new ListNode(20);
		ListNode node2 = new ListNode(30);
		ListNode node3 = new ListNode(40);
		ListNode node4 = new ListNode(50);
		ListNode node5 = new ListNode(60);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
	}
	public void reverse()
	{
		reverseList(head);
	}
	public void print()
	{
		ListNode temp = head;
		while(temp != null)
		{
			System.out.println(temp.data+"->");
			temp =temp.next;
		}
	}
	public void reverseList(ListNode curr)
	{
		//using receursion
		if(curr == null)
			return;
		if(curr.next == null)
		{
			head = curr;
			return;
		}
		reverseList(curr.next);
		curr.next.next = curr;
		curr.next = null;
		
		
	}
	public void reverseIterative()
	{
		ListNode temp = head;
		ListNode curr,prev = null,next = null;
		curr = head;
		while(curr != null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
}
