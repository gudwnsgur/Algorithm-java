package Practice2_LinkedList;

public class Chain <Type>{
	protected ChainNode<Type> first;	// Node that pointing first node
	
	public Chain()  {first = null;}	// constructor of Chain class

	public void InsertFront(Type item)	{	// Insert node in front of chain
		ChainNode<Type> p = new ChainNode<Type>(item);	
		if(first == null) first = p;	// if there is no node, p will be first node
		else {					// if there is node
			p.link = first;		// connect p in front of first 
			first =p;			// and then, p become first node
		}
		Print();
	};
	
	public void InsertBack(Type item) {	// Insert node at the end of chain
		ChainNode<Type> p = new ChainNode<Type>(item);	
		if(first == null) first = p;	// if there is no node, p will be first node (also, last node) 
		else {			// if there is node
			ChainNode<Type> q;		
			for( q = first ; q.link != null ; q=q.link);
			// end of this for loop, q will be the last node
			q.link = p;	// connect p behind q
		}
		Print();
	};

	public void DeleteFront() {	// Delete the first node
		if(first == null)	{
			System.out.println("there is no node to delete");
			return;
		}
		ChainNode<Type> p = first.link; // p is pointing second node
		first = p;	// and then p will be first node 
		Print();
	};

	public void DeleteBack() {	// Delete the last node
		if(first == null)	{	// if there is no node
			System.out.println("there is no node to delete");
			return;
		}
		else if(first.link == null) { // if there is one node 
			first = null;
		}	
		else {	// if nodes are	more than two.
			ChainNode<Type> p = first;
			for(; p.link.link != null ; p = p.link);
				// p will be stop on the 2nd node from the last
			p.link = null; // cut off p's link
		}
		Print();
	};
	
	public boolean CheckNode (Type x) {	// check that node with data x exist
		int count = 0;
		for(ChainNode<Type> p=first ; p !=null ; p=p.link ) {
			count++;	// count the node's index that including data x
			if(p.data == x) {
				System.out.println("there is " + x + " in " + count + " 'th node!!");
				return true;
			}
		}
		System.out.println("node including " + x + " is not exist");
		return false;
	}
	
	public void Print() {		// printing my chain
		ChainNode<Type> p = new ChainNode<Type>();
		for(p=first ; p != null ; p=p.link ) 
			System.out.print(p.data + " ");
		System.out.println();
	};
}