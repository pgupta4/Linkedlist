
public class ListNode {
	int data;
	ListNode next;
	ListNode(int data)
	{
		this.data = data;
		next = null;
	}
	
	public static boolean loopcheck(ListNode head)
	{
		ListNode slow, fast;
		slow = head;
		fast = head;
		
		while(slow != null && fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
				return true;
		}
		return false;
	}
}
