package my_LinkedList;

public class LinkedList_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chain x = new Chain ();
		x.Addfront(3);
		x.Addlast(2);
		x.Addlast(1);
		x.Addfront(10);
		x.Deletefront();
		x.Deletelast();
		
		
		x.Print();
	}

}
