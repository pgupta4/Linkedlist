
public class main {

	
	public static void main(String[] args) {
		createLoopList();
		ListNode temp = removeNode(2);
		print(temp);
		// TODO Auto-generated method stub
		//System.out.println(head.next.data);
		//System.out.println("loop is avaialble or not : " +loopcheck(createList()));
	}
	public static void print(ListNode head)
	{
		if(head == null)
		{
			System.out.println("List is Empty");
			return;
		}
		ListNode temp =head;
		while(temp != null)
		{
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
		
	}
	public static ListNode createLinkList()
	{
		ListNode head = new ListNode(10);
		ListNode node1 = new ListNode(20);
		ListNode node2 = new ListNode(30);
		ListNode node3 = new ListNode(40);
		ListNode node4 = new ListNode(50);
		//ListNode node5 = new ListNode(60);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		//node4.next = node5;
		return head;
	}
	
	public static ListNode removeNode(int n)
	{
		ListNode head = createLinkList();
		
		if(head == null)
		{
			return null;
		}
		ListNode slow, fast;
		slow = head;
		fast = head;
		for(int i =1; i<= n+1; i++) // always keep n+1 difference between slow and fast for tracking
		{
			fast = fast.next;
		}
		while(fast!=null)
		{
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		
		return head;
	}
	
	public static void createLoopList()
	{	
	 
		ListNode head = new ListNode(50);
		head.next = new ListNode(20);
		head.next.next = new ListNode(15);
		head.next.next.next = new ListNode(4);
		head.next.next.next = new ListNode(10);
		head.next.next.next.next = head.next.next.next;
		

		ListNode slow = head, fast = head;
       
		while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
 
            // If slow and fast meet at same point then loop is present
            if (slow == fast) {
               
                System.out.println("Loop present");
                return;
            }
        }
		System.out.println("Loop is not present");
		return;
		
	}

}
