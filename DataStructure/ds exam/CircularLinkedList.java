public class CircularLinkedList {
	
	
	public Node root1;
	public Node root2;
	public Node last1;
	public Node last2;
	
	public void createLinkList() {
		root1=null;
		root2=null;
	}
	
	public void insertAtRight(int data) {
		Node n=new Node(data);
		if(data%2==0) {
			if(root1==null) {
				root1=last1=n;
				last1.next=root1;		
			}
			else {
				last1.next=n;
				last1=n;
				last1.next=root1;
			}
		}
		else {
			if(root2==null) {
				root2=last2=n;
				last2.next=root2;
			}
			else {
				last2.next=n;
				last2=n;
				last2.next=root2;
			}
		}
		
		

}
	
	void printEvenNodes() {
		if(root1==null)
			System.out.println("List is Empty");
		else {
			System.out.println("Even List");
			Node t=root1;
			do {
				System.out.println(t.data);
				t=t.next;
			}while(t!=root1);
		}
	}
	
	void printOddNodes() {
		if(root2==null)
			System.out.println("List is Empty");
		else {
			System.out.println("Odd List");
			Node t=root2;
			do {
				System.out.println(t.data);
				t=t.next;
			}while(t!=root2);
		}
	}
	void printMergeList() {
		if(root2==null)
			System.out.println("List is Empty");
		else {
			System.out.println("MegerdList");
			Node t=root2;
			do {
				System.out.println(t.data);
				t=t.next;
			}while(t!=root2);
		}
	}
	
	void mergeList() {
		if(root1==null && root2==null) {
			System.out.println("Cann't do merging");
		}
		else
		{
			last1.next=root2;
			last1=last2;
			last1.next=root1;
		}
	}
	
	
}
public class Test {

	public static void main(String[] args) {
		CircularLinkedList obj=new CircularLinkedList();
		obj.insertAtRight(10);
		obj.insertAtRight(11);
		obj.insertAtRight(12);
		obj.insertAtRight(13);
		obj.insertAtRight(14);
		obj.insertAtRight(15);
		obj.insertAtRight(16);
		obj.printEvenNodes();
		obj.printOddNodes();
		obj.mergeList();
		obj.printMergeList();
		

	}

}