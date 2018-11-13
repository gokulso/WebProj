package testone.collections;

public class SinglyLinkedList<T> {
	
	private Node<T> head;
	private Node<T> tail;
	
	public void add(T element) {
		Node<T> nd = new Node<>();
		nd.setValue(element);
		System.out.println("Adding " + element);
		/**
		 * check if the list is empty
		 */
		if (head == null) {
			head = nd; // since there is only one element, both head and tail points to the same object.						
			tail = nd;
		} else {
			tail.setNextRef(nd); // Set current tail to next link to new Node
			tail = nd; // set tail as newly created node
		}

	}
	
	public void addAfter(T element, T after) {
		Node<T> tmp = head;
		Node<T> refNode = null;
		System.out.println("Traversing to all nodes..");
		/**
		 * Traverse till given element
		 */

		while (true) {
			if (tmp == null)
				break;
			if (tmp.compareTo(after) == 0) {
				refNode = tmp; // Found the target Node, add after this node
				break;
			}
			tmp = tmp.getNextRef();
		}

		if (refNode != null) {
			// Add element after the target
			Node<T> nd = new Node<>();
			nd.setValue(element);
			nd.setNextRef(tmp.getNextRef());
			if (tmp == tail) {
				tail = nd;
			}
			tmp.setNextRef(nd);
		} else {
			System.out.println("Unable to find given element");
		}

	}
	
	 public void deleteFront(){
         
	        if(head == null){
	            System.out.println("Underflow...");
	        }
	        Node<T> tmp = head;
	        head = tmp.getNextRef();
	        if(head == null){
	            tail = null;
	        }
	        System.out.println("Deleted Value: "+tmp.getValue());
	    }
	 
	 public void deleteAfter(T after){
         
	        Node<T> tmp = head;
	        Node<T> refNode = null;
	        System.out.println("Traversing to all nodes..");
	        /**
	         * Traverse till given element
	         */
	        while(true){
	            if(tmp == null){
	                break;
	            }
	            if(tmp.compareTo(after) == 0){
	                //found the target node, add after this node
	                refNode = tmp;
	                break;
	            }
	            tmp = tmp.getNextRef();
	        }
	        if(refNode != null){
	            tmp = refNode.getNextRef();
	            refNode.setNextRef(tmp.getNextRef());
	            if(refNode.getNextRef() == null){
	                tail = refNode;
	            }
	            System.out.println("Deleted: "+tmp.getValue());
	        } else {
	            System.out.println("Unable to find the given element...");
	        }
	    }
	     
	public void traverse() {

		System.out.println("traversing");
		Node<T> tmp = head;
		while (true) {
			if (tmp == null) {
				break;
			}
			System.out.print(tmp.getValue() + ", ");
			tmp = tmp.getNextRef();

		}

	}
	
	 public void reverse(){
		 System.out.println("\nreversing the linked list\n");
		 
		 Node<T> prev = null;
		 Node<T> current = head;
		 Node<T> next = null;
		 
		 while(current != null){
			 next = current.getNextRef();
			 current.setNextRef(prev);
			 prev = current;
			 current = next;
		 }
		 head = prev;
	 }
	 
	 public int getSize(){
	       int length = 0;
	       Node<T> current = head;
	       while(current != null){
	    	   length ++;
	    	   current = current.nextRef;
	       }
	   System.out.println("length is: " + length);
	   return length;    
	 }
	 
	 public boolean isEmpty(){
		 
	     boolean result = getSize() == 0;
		 String print = result ? "True" : "False";
		 System.out.println(print);
		 
		 return result;
	 }

	

	public static void main(String[] args) {
		
		  SinglyLinkedList<Integer> sl = new SinglyLinkedList<>();
	        sl.isEmpty();
		    sl.add(3);
	        sl.add(32);
	        sl.add(54);
	        sl.add(89);
	        sl.addAfter(76, 54);
	        sl.isEmpty();
	        sl.traverse();
	        sl.deleteAfter(76);
	        sl.reverse();
	        sl.traverse();
		
	}
	
	
	
	
	
	class Node<T> implements Comparable<T> {

		private T value;
		private Node<T> nextRef;

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Node<T> getNextRef() {
			return nextRef;
		}

		public void setNextRef(Node<T> nextRef) {
			this.nextRef = nextRef;
		}

		@Override
		public int compareTo(T arg) {

			if (arg == this.value) {
				return 0;
			} else {
				return 1;
			}

		}

	}

}
