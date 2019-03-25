package Practice3_LinkedStack;

public class ChainNode <Type> {
	
	Type data;
	ChainNode <Type> link;
	//data member 'top' and 'link'
	
	ChainNode() {}
	ChainNode(Type data) {this.data = data;}
	ChainNode(Type data, ChainNode<Type> link) 
		{this.data=data;	this.link=link;}
	//constructors of class ChainNode
}
