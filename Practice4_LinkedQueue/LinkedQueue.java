package Practice4_LinkedQueue;

public class LinkedQueue<Type2> {
	   // data members
	   protected ChainNode<Type2> front;
	   protected ChainNode<Type2> rear;

	   // constructors
	   public LinkedQueue(int initialCapacity)
	   { front = rear = null ; }
	   public LinkedQueue()
	      {this(0);}

	   // methods
	   /** @return true iff queue is empty */
	   public boolean isEmpty()
	       {return front == null;}

	   /** @return the element at the front of the queue
	     * @return null if the queue is empty */
	   public Type2 getFrontElement()
	   {
	      if (isEmpty())
	         return null;
	      else
	         return front.element;
	   }

	   /** @return the element at the rear of the queue
	     * @return null if the queue is empty */
	   public Type2 getRearElement()
	   {
	      if (isEmpty())
	         return null;
	      else
	         return rear.element;
	   }

	   /** insert theElement at the rear of the queue */
	   public void put(Type2 theElement)
	   {
	      // create a node for theElement
	      ChainNode<Type2> p = new ChainNode<Type2>(theElement, null);

	      // append p to the chain
	      if (front == null)
	         front = p;                 // empty queue
	      else 
	         rear.next = p;             // nonempty queue
	      rear = p;
	   }

	   /** remove an element from the front of the queue
	     * @return removed element
	     * @return null if the queue is empty */
	   public Type2 remove()
	   {
	      if (isEmpty())
	         return null;
	      Type2 frontElement = front.element;
	      front = front.next;
	      if (isEmpty())
	         rear = null;  // enable garbage collection
	      return frontElement;
	   }
	   
		public void Print() {		// printing my chain
			ChainNode<Type2> p = new ChainNode<Type2>();
			for(p=front ; p != null ; p=p.next ) 
				System.out.print(p.element + " ");
			System.out.println();
		};
}
