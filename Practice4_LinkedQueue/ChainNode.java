package Practice4_LinkedQueue;

public class ChainNode<Type> {
	   // package visible data members
	   Type element;
	   ChainNode<Type> next;

	   // package visible constructors
	   ChainNode() {}	     
	   ChainNode(Type element)  {this.element = element;}
	   ChainNode(Type element, ChainNode<Type> next)
	      {this.element = element; this.next = next;}
}