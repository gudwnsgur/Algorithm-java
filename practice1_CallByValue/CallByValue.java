package Practice1_CallByValue;

import java.util.Arrays;

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;					// value of int
		int arr[] = {1,2,3,4};		// object array of int
		StringBuffer sb = new StringBuffer("abcde"); // String
		
		display(n,arr,sb);	
		Change_value(n,arr,sb);
		display(n,arr,sb);	//changed only arr and sb 
	}

	static void display(int n, int arr[], StringBuffer sb) {
		System.out.println(n);
		System.out.println(Arrays.toString(arr));
		System.out.println(sb);	
	}
	static void Change_value(int n, int arr[], StringBuffer sb) {
		n = 10;			// this is call by value because n is value of int, so value has not changed 
		arr[1] = 5;		// this is call by reference because arr and sb are object 
		sb.append("fghij");	// so both arr's value and sb's value are changed	
		System.out.println("values are changed!");
	}
}