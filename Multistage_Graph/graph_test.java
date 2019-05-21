package Multistage_Graph;
import java.util.Scanner;

public class graph_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, e, stage;
		int Min_cost;	// Minimum cost of Multistage Graph
		Scanner sc = new Scanner (System.in);
		
		System.out.print("number of Vertex : ");
		n = sc.nextInt();
		
		System.out.print("number of Edge : ");
		e = sc.nextInt();
		
	
		Multistage_graph My_Graph = new Multistage_graph(n, e);
		My_Graph.Insert_E();	// insert edges 
		
		stage = My_Graph.Last_stage();	// decide stage of last node
		Min_cost = My_Graph.bcost(stage,n);	
		// decide minimum cost of shortest path
		

		My_Graph.Print_Matrix(); // print Matrix
		My_Graph.Print_cost();	 // print cost of each vertices
		My_Graph.Print_path();	 // print shortest path
		
		System.out.println("Minimum cost : " + Min_cost);
		// print minimum cost of shortest path
	}
}


