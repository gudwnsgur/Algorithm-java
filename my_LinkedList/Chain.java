package my_LinkedList;

public class Chain {
	ChainNode first;
	Chain() {first = null;}
	
	
	void Addfront (Object item)
	{
		ChainNode p = new ChainNode(item, null);
		if(first == null) 	first = p;
		else {
			p.link = first;
			first = p;
		}
	}
	
	void Addlast (Object item)
	{
		ChainNode X = new ChainNode(item, null);
		if(first == null)
			first = X;
		else {
			ChainNode p;
			for(p=first; p.link != null ; p=p.link) ;
			p.link = X;
		}
	}
	
	Object Deletefront ()
	{
		ChainNode x = first;
		Object data = x.element;
		
		if(first == null)  	return null;
		else {
			first = first.link;
			x = null;
			return data;
		}
	}
	
	Object Deletelast ()
	{
		if(first == null) {return null;}
		else if(first.link == null)
		{
			Object x = first.element;
			first = null;
			return x;
		}
		else {
			ChainNode P=first, C=first.link;
			
			for(;C.link != null ; C=C.link, P=P.link);
			Object x = C.element;
			P.link = null;
			C = null;
			return x;
		}
	}
	
	void Print () {
		for(ChainNode p=first; p != null ; p=p.link) 
			System.out.print(p.element + " ");
	}
	
}
