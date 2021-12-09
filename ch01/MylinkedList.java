package ch01;

public class MylinkedList {
	private MyListNode head;
	private int count;
	
	public MylinkedList() {
		this.head = null;
		this.count = 0;
	}
	
	public MyListNode addElement(String data){
		MyListNode newNode = new MyListNode(data);
		if(head == null) {
			head = newNode;
		}
		else {
			MyListNode temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public void insertElement(String data,int position) {
		MyListNode newNode = new MyListNode(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		if(position == 0) {
			newNode.next = head;
			head = newNode;
		}
		else if(position < 0 || position > count) {
			System.out.println("position 값 틀림");
			return;
		}
		else {
			MyListNode temp = head;
			MyListNode pre = null;
			for (int i = 0; i < position; i++) {
				pre = temp;
				temp = temp.next;
			}
			pre.next = newNode;
			newNode.next = temp;
			
		}
		count++;
	}
		
	public String removeElement(int position) {
		MyListNode temp = head;
		MyListNode pre = null;
		
		if(position < 0 || position > count) {
			System.out.println("갑틀림");
			return null;
		}
		
		if (position == 0) {
			head = temp.next;
		}
		else {
			for(int i = 0; i<position; i++) {
				pre = temp;
				temp = temp.next;
			}
			pre.next = temp.next;
			
		}
		count--;
		return temp.getData();
	}
	
	public void printAll() {
		MyListNode temp = head;
		
		while(temp != null) {
			System.out.print(temp.getData());
			if(temp.next != null) {
				System.out.print("->");
			}
			temp = temp.next;
		}
		System.out.println();
	}
	
	public boolean isEmpty() {
		if(count == 0) {
			return true;
		}
		else 
			return false;
	}
}
