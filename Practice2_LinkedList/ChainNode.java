package Practice2_LinkedList;

public class ChainNode <Type>
{
	Type data;
	ChainNode<Type> link;
	
	ChainNode () {}
	ChainNode(Type data) {this.data = data;}
	ChainNode(Type data, ChainNode <Type> link) 
	{	this.data = data;	this.link = link;	}
}
