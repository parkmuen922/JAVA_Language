package ch02;

public class MyListQueueTest {

	public static void main(String[] args) {
		MyListQueue qList = new MyListQueue();
		qList.enQueue("A");
		qList.enQueue("B");
		qList.enQueue("C");
		qList.enQueue("D");
		qList.enQueue("E");
		qList.enQueue("F");
		
		qList.printAll();
		
		System.out.println(qList.deQueue() + "삭제");
		System.out.println(qList.deQueue() + "삭제");
		qList.printAll();
	}

}
