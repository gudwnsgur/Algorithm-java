package Practice3_LinkedStack;

public class LinkedStack_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedStack<Integer> s = new LinkedStack<Integer>();
		
		s.push(1);
		s.push(3);
		s.push(10);
		s.push(7);
		  
		s.Print();
		System.out.println("Top element is " + s.peek());
		
		while (!s.empty())	{
	         System.out.println("Removed the element " + s.pop());
	         s.Print();
	    }
	}  
}

	
