package Practice4_LinkedQueue;


public class LinkedQueue_Test {

	   public static void main(String [] args)
	   {  
	      LinkedQueue<Integer> q = new LinkedQueue<Integer>(3);
	      // add a few elements
	      q.put(new Integer(1));
	      q.put(new Integer(2));
	      q.put(new Integer(3));
	      q.put(new Integer(4));

	      // delete all elements
	      while (!q.isEmpty())
	      {
	         System.out.println("Rear element is " + q.getRearElement());
	         System.out.println("Front element is " + q.getFrontElement());
	         System.out.println("Removed the element " + q.remove());
	      }
	   }  
}



