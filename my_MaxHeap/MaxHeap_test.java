package my_MaxHeap;

public class MaxHeap_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxHeap h = new MaxHeap(10);
		h.Put(new Integer(10));
		h.Put(new Integer(20));
		h.Put(new Integer(30));
		
		h.Delete();
		
		h.Put(new Integer(25));
		h.Put(new Integer(40));
		
		
		h.Put(new Integer(5));
		h.Delete();
		h.Put(new Integer(15));
		
		h.Print();
		
		
		
		
	}

}
