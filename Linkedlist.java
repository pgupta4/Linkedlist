
public class Linkedlist {
	
	private class ListNode
	{
		int val;
		ListNode next;
		ListNode(int v,ListNode next)
		{
			this.val =v;
			this.next = next;
		}
		
	}
	
	private ListNode head;
	private ListNode tail;
	
	public void addNodes(int v)
	{
		if(head == null)
		{
			head = new ListNode(v, null);
			tail = head;
			return;
		}
		tail.next = new ListNode(v, null);
		tail = tail.next;
		
	}
	public void print()
	{
		ListNode temp = head;
		while(temp != null)
		{
			System.out.print(temp.val + "-> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

}

