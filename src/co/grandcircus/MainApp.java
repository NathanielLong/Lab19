package co.grandcircus;

public class MainApp {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.addAtBeginning("hello");
		list.addAtBeginning("hello2");
		list.addAtBeginning("hello3");
		list.addAtBeginning("hello4");
		System.out.println(list);
		list.removeFromBeginning();
		System.out.println(list);
		list.addAtEnd("goodbye");
		System.out.println(list);
		
		MyLinkedList list2 = new MyLinkedList();
		list2.addAtBeginning("Help");
		list2.addAtBeginning("Help1");
		list2.addAtBeginning("Help2");
		list2.addAtBeginning("Help3");
		System.out.println(list2);
		list2.removeFromBeginning();
		System.out.println(list2);
		list2.addAtEnd("Help3");
		System.out.println(list2);
		list2.removeAt(1);
		System.out.println(list2);
	}

}
