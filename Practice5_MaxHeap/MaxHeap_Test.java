package Practice5_MaxHeap;

public class MaxHeap_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxHeap H = new MaxHeap(15);
		
		H.Insert(new Integer(30));
		H.Insert(new Integer(10));
		H.Insert(new Integer(25));
		H.Insert(new Integer(7));
	
		System.out.print("Current Heap : ");
		H.Print();
		
		H.Insert(18);
		H.Insert(20);
		System.out.println("Deleted max Node " + H.Delete());
		System.out.println("Deleted max Node " + H.Delete());

		H.Insert(new Integer(13));
		H.Insert(new Integer(39));	
		
		System.out.print("Current Heap : ");
		H.Print();
	}
}
