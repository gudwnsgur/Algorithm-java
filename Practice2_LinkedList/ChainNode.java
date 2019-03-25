package Practice2_LinkedList;

public class ChainNode <Type>
{
	Type data;
	ChainNode<Type> link;
	
	public ChainNode () {}
	public ChainNode(Type data) {this.data = data;}
	public ChainNode(Type data, ChainNode <Type> link) 
	{	this.data = data;	this.link = link;	}
}
