
public class Loopdetection {
	
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
	
	public ListNode removeLoop(ListNode head, ListNode slow,ListNode fast)
	{
		slow=head;
		while(fast != slow)
		{
			fast = fast.next;
			slow = slow.next;
		}
		return fast;
		
	}
	
	public boolean Loopdetection()
	{
		
		ListNode slow,fast;
		slow = head;
		fast = head;
		
		while(slow !=null && fast !=null && fast.next != null)
		{
			slow= slow.next;
			fast = fast.next.next;
			if(slow == fast)
			{
				System.out.println("Loop detected....");
				System.out.println("removing loop....");
				ListNode loopStart = removeLoop(head, slow, fast);
				System.out.println("loop is starting at loopStart: " + loopStart.data);
				return true;
			}		
		}
		System.out.println("loop is not avaiable");
		return false;
		
		// TODO Auto-generated constructor stub
	}
	public void printlist()
	{
		ListNode list = head;
		while(list != null)
		{
			System.out.println(list.data);
			list = list.next;
		}
	}
	public void createLoop()
	{
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
		node5.next = node3;
		
	}
}
