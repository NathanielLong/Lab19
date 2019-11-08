package co.grandcircus;

public class MyLinkedList implements MyList {
	
	private Node head;
	private Node tail;
	private int myLength = 0;

	@Override
	public void addAtBeginning(String data) {
		//Add a new Node and set it to the head
		head = new Node(head, data);
		myLength++;

	}

	@Override
	public void removeFromBeginning() {
		head = head.getNext();
		myLength--;

	}

	@Override
	public void addAtEnd(String data) {
		Node node = new Node(null, data);
		Node tail = getNodeAt(myLength - 1);
		tail.setNext(node);
		myLength++;

	}

	@Override
	public void removeFromEnd() {
		if (myLength < 2) {
			head.setNext(null);
		}
		Node newTail = getNodeAt(myLength - 2);
		newTail.setNext(null);
		myLength--;

	}
	
	public Boolean removeAt(int index) {
		Node node = head;
		if (index > myLength) {
			return false;
		}
		if (index == 0) {
			head = node.getNext();
			myLength--;
			}
		else {
			for (int i = 0; i < index - 1; i++) {
				node = node.getNext();
			}
				node.setNext(node.getNext().getNext());
				myLength--;
			
		}
		return true;	
	}
	
    public Boolean insertAt(int index, String cheese)
    {
        Node node = head;
        Node newNode = (new Node(node,cheese));
        if(index > myLength)
            return false;
        if(index == 0)
        {
            addAtBeginning(cheese);
        }
        
        else
        {
        for(int i = 0; i<index-1; i++)
            node = node.getNext();
        
        newNode.setNext(node.getNext());
        node.setNext(newNode);
        myLength++;
        }
        return true;
    }
		


	@Override
	public int size() {
		return myLength;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[ ");
		Node node = head;
		//Follow the links between the nodes until it reaches the end
		while (node != null) {
			sb.append(node);
			node = node.getNext();
		}
		sb.append(" ]");
		return sb.toString();
	}

	@Override
	public String get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
    // created a helper method to get the node at a certain location
    // to help us prevent some code duplication
    private Node getNodeAt(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            if (node == null) {
                return null;
            }
            node = node.getNext();
        }
        return node;
    }
	

}
