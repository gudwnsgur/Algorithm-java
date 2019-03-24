package Practice2_LinkedList;

public class LinkedList_test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chain<Integer> X = new Chain<Integer> ();
			// <Type> is <Integer> 
		
		X.InsertFront(3);
		X.InsertFront(5);
		
		X.CheckNode(3);
	
		X.InsertBack(1);
		X.InsertFront(10);
		X.DeleteFront();
		X.InsertBack(12);
		X.DeleteFront();
	}
}
