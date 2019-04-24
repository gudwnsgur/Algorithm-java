package my_MaxHeap;

public class MaxHeap {
	private Comparable[] heap;
	private int size;
	
	MaxHeap () {this(10);}
	MaxHeap (int init) {
		size=0;
		heap = new Comparable[init+1];
	}
	
	void Put (Comparable item) {
		if(size == heap.length-1) return;
		int cur_Node = ++size;
		while(cur_Node != 1 && heap[cur_Node/2].compareTo(item) < 0 ) {
			heap[cur_Node] = heap[cur_Node/2];
			cur_Node /= 2;
		}
		heap[cur_Node] = item;
	}
	
	
	Comparable Delete () {
		
		if(size ==0 ) return null;
		Comparable Max = heap[1], Last = heap[size--];
		
		int P=1, C=2;
		while(C <= size) {
			if(C < size && heap[C].compareTo(heap[C+1]) < 0 ) 	C++;
			if( heap[C].compareTo(Last) < 0 ) break;
			heap[P] = heap[C];	P=C; C *=2;
		}
		heap[P]  = Last;
		return Max;
	}
	void Print () {
		for(int i=1 ; i<= size ; i++) {
			System.out.print( heap[i]+" ");
		}
	}
}