package Multistage_Graph;
import java.util.Scanner;
// import java.util.LinkedList;
// import java.util.Queue;

public class Multistage_graph 
{
	private int n, e;
	// number of vertices, number of edges;
	private int stage; 	// stage of last node;
	private int graph[][];	// adjacency matrix 
	private int p[];	// array for trace path
	private int cost[];	// cost of each vertices
	
	public Multistage_graph(int n, int e) 	{ // constructor 
		this.n = n;		this.e = e; 
		graph = new int[n+1][n+1];
		p = new int[n+1]; 
		cost = new int[n+1];
	}
	
	void Insert_E() // Insert edges
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Insert edges in order of start v, end v, weight of e");
		// v = vertex, e = edge
		for(int i=1; i<=e ; i++) {
			int start, end, weight;
			System.out.print("Edge number " + i + " : ");
			start = sc.nextInt();	end = sc.nextInt(); weight = sc.nextInt();
			graph[start][end] = weight;
		}
	}
	
	
	// suppose that any node can be linked with start node and last node
	int Last_stage () { // Search last stage of graph
	//	Queue<Integer> Q = new LinkedList<Integer>();
		int stage = 1, i = 1 ;
		
		for(int j=2 ; j<=n ; j++) {
			if(graph[i][j] != 0 ) { // if i is connected with j
				i = j; 		
				stage++;	// increase stage
			}	
		}
		this.stage = stage; 
		return stage;
	}	
	
	int bcost (int i, int j) {	// search minimum cost of graph
		int Min = 9999;		// length of minimum path
		int Min_index = 0;	// correspond index
		for(int l = 1 ; l <= n ; l++) {  
			if(graph[l][j] != 0) {	// if vertices are connected
				int c = bcost(i-1,l) + graph[l][j];	
				if(Min > c) {	// if this path is shorter than previous
					Min = c;	// reset minimum length
					Min_index = l;	// correspond index will shortest path
				}
			}
		}
		if(Min_index == 0)	// if connected node has not exist. 
			return 0;	
		else {	// if connected node has exist.
			p[j] = Min_index;	// store node in path
			cost[j] = Min;
			return Min;		// return Minimum length
		}
	} 
	
	void Print_Matrix () 	{	// print adjacency matrix
		System.out.println("adjacency matrix");
		for(int i=1 ; i<=n ; i++) {	
			for(int j=1 ; j<=n ; j++)
				System.out.print(graph[i][j] + " ");
			System.out.println();
		}
	}
	
	void Print_cost () {	// print cost of each vertices
		System.out.println("cost of each vertices");
		for(int i=1 ; i<=n ; i++)
			System.out.println("vertex " + i + " : " + cost[i]);
	}
	
	void Print_path() {	// print path of minimum cost
		int path[] = new int [stage]; 	
		int i= n ;
		path[stage-1] = n;
		
		for(int j=stage-2 ; j>=0 ; j--) {
			path[j] = p[i]; 
			i = p[i];
		}
		System.out.print("Shortest path : ");
		for(i=0 ; i<stage-1 ; i++) 
			System.out.print(path[i] + " -> ");
		System.out.println(path[i]);	
	}
}
