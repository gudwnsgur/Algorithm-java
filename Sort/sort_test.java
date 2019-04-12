package Sort;
import java.util.Scanner;
import java.util.Random;

public class sort_test {

	public static void main(String[] args) {
		Quick_sort Q;
		Merge_sort M;
		
		Scanner sc = new Scanner(System.in);	// standard input class
		Random rand = new Random();
		int i, n;	// index, input number
		double start, end;	// variables for check execute time
		double[][] exec_time = new double[2][10];
		
		System.out.print("number of array n : ");
		n = sc.nextInt();	// input n (size of array)
		int quick_arr[] = new int[n+2];
		int merge_arr[] = new int[n+1];

		// initialize random number in array
		System.out.println("quick sort     merge sort");
		for(i=0 ; i<10 ; i++) {
			
			for(int j=1; j<n ; j++) 
				merge_arr[j] = quick_arr[j] = rand.nextInt();
		
			Q = new Quick_sort(quick_arr,n);
			M = new Merge_sort(merge_arr,n);

			start = System.currentTimeMillis();
			Q.QuickSortCall();
			end = System.currentTimeMillis();
			
			exec_time[0][i] = (end-start)/1000.000;
			

			start = System.currentTimeMillis();
			M.MergeSortCall();
			end = System.currentTimeMillis();
			
			exec_time[1][i] = (end-start)/1000.000;
			
			System.out.print(i+1 +" : " + String.format("%.3f",exec_time[0][i]) + "    ");
			System.out.println(i+1 +" : " + String.format("%.3f",exec_time[1][i]));
		}
		
		double Q_avg_time=0, M_avg_time=0;
		for(i=0 ; i<10; i++) {
			Q_avg_time += exec_time[0][i];
			M_avg_time += exec_time[1][i];
		}
		Q_avg_time = Q_avg_time/10;	M_avg_time= M_avg_time/10;
		System.out.println("average of Quick Sort with size " +n+" : "+ String.format("%.5f",Q_avg_time));
		System.out.println("average of Merge Sort with size " +n+" : "+String.format("%.5f", M_avg_time));
	}
}
