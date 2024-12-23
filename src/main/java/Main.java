package reshimot;


public class exe {

	public static Node<Integer> del2(Node<Integer> L1) {
	    Node<Integer> head = L1;
	    Node<Integer> current1 = L1;
	    Node<Integer> current2 = L1;


	    while (current1.hasNext()) {
	    	current2=current1;
		    while (current2.hasNext()) {
		    	if(current1.getValue()==current2.getNext().getValue()) {
		    		current2.setNext(current2.getNext().getNext());
		    	}
		    	else {
		    		current2=current2.getNext();
		    	}
		    	
		    }
    		current1=current1.getNext();

	    	
	    }
    	return head;

	}
	
	

	public static Node<Integer> delEven(Node<Integer> H) {
		Node<Integer> current = H;
		Node<Integer> newH = new Node<>(null);
		Node<Integer> newCurrent = newH;
		while (current.getNext().getNext()!=null) {
			newCurrent.setNext(current.getNext());
			newCurrent = current.getNext();
			current.setNext(current.getNext().getNext());
			current = current.getNext();
		}
		newCurrent.setNext(current.getNext());
		current.setNext(current.getNext().getNext());
		return newH.getNext();
	}


	public static void main(String[] args) {
		int [] arr= {1,2,3,4,3,6,5};
	    Node<Integer> L1 = new Node<>(1); 
	    Node<Integer> second = new Node<>(2);
	    Node<Integer> third = new Node<>(3);
	    Node<Integer> fourth = new Node<>(1);
	    Node<Integer> fifth = new Node<>(7);
	    L1.setNext(second);
	    second.setNext(third);
	    third.setNext(fourth);
	    fourth.setNext(fifth);
	    
	   System.out.println(del2(L1));
	
	
}
}
