package Practice3_LinkedStack;
import java.util.EmptyStackException;

public class LinkedStack<Type> {
	protected ChainNode<Type> top;	// data member 'top'
	
	
	public LinkedStack() 
	{ top = null;}
	// constructor of class LinkedStack
	
	public void push(Type item) 
		{top = new ChainNode<Type>(item,top);} 
	// the node that having item will be the top of the stack
	// method 'push' that insert item in to the top of stack
	
	public Type pop () {
		if(empty())
			throw new EmptyStackException();	// exception of empty 
		Type x = top.data;	// load data of top in to x
		top = top.link;		// top point link of top
		return x;			// return data what we deleted 
	}
	// method 'pop' that delete the top of stack
	
	public boolean empty() 
	{return top==null;}		// check empty

	public Type peek() {
		if (empty())
			throw new EmptyStackException();
		return top.data;	// return data of top
	}
	// method member 
	
	public void Print() {		// printing my chain
		ChainNode<Type> p = new ChainNode<Type>();
		for(p=top ; p != null ; p=p.link ) 
			System.out.print(p.data + " ");
		System.out.println();
	};
}
