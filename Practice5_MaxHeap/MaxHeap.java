package Practice5_MaxHeap;	
// Parent node must be bigger than Child node

public class MaxHeap
{
	Comparable [] heap;	// binary tree array
	int size;			// number of node in heap
	
	public MaxHeap (int init) {
		heap = new Comparable [init + 1];
		// do not use heap[0]
		size = 0;
	}
	//constructors of MaxHeap
	
	public boolean isEmpty() {return size==0;}
	// if heap is empty, isEmpty() return true
	public int size() {return size;}	
	// return size of heap
	
	public void Insert (Comparable item) 
	{
		if(heap.length-1 == size) {
			System.out.println("Heap is full.");
			return;
		}
		// find place for theElement
		// currentNode starts at new leaf and moves up tree
		int currentNode = ++size;
		while (currentNode != 1 && heap[currentNode/2].compareTo(item) < 0)
		{
			// cannot put theElement in heap[currentNode]
			heap[currentNode] = heap[currentNode / 2]; // move element down
			currentNode /= 2;                          // move to parent
		}
		heap[currentNode] = item;
		System.out.println("add node "+ item);
}
	
	public Comparable Delete ()	// delete Max Node
	{
		if (size == 0) return null;    // if heap is empty return null
		   
		Comparable maxNode = heap[1];  // max Node
		Comparable lastNode = heap[size--];
	   
		int currentNode = 1, child = 2;     // child of currentNode
		while (child <= size)	
		{
			// heap[child] should be larger child of currentNode
			if (child < size && heap[child].compareTo(heap[child + 1]) < 0) child++;
			// can we put lastElement in heap[currentNode]?
			if (lastNode.compareTo(heap[child]) >= 0)  break;   // yes
	   
			heap[currentNode] = heap[child]; // move child up
			currentNode = child;             // move down a level
			child *= 2;
		}
		heap[currentNode] = lastNode;
		return maxNode;
	}
	public void Print () {
		for(int i=1; i<= size ; i++) 
			System.out.print(heap[i] + " ");
	System.out.println();	
	}
}
