package ch01;

public class MylinkedListTest {

	public static void main(String[] args) {
		MylinkedList list = new MylinkedList();
		
		list.addElement("A");
		list.addElement("B");
		list.addElement("C");
		list.printAll();
		list.insertElement("D", 0);
		list.removeElement(1);
		list.printAll();
	}

}
