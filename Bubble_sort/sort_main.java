package Bubble_sort;
import java.util.Scanner;

public class sort_main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	// 표준 입력 클래스 생성
		int n;				// 입력받을 숫자의 개수  n 생성
		int My_arr[];		// 입력받은 숫자를 대입할 배열 My_arr 생성
		
		System.out.print("n 값 입력 : ");	// 표준 출력
		n = sc.nextInt();		// 표준 입력 클래스의 nextInt() 함수로 n에 정수 대입
		
		My_arr = new int[n];	// My_arr 배열을 n 만큼 동적 할당
		
		System.out.print(n + " 개의 정수 입력 : ");	// 표준 출력
		for(int i=0; i<n ; i++) {			
			My_arr[i] = sc.nextInt();		// My_arr 배열에 n개의 숫자 입력 
		}
		
		Bubble_sort(My_arr, n);	// 정렬함수 (Arrange) 호출
		
		System.out.print("정렬 결과 : ");	// 결과
		for(int i=0; i<n ; i++) {			
			System.out.print(My_arr[i] + " ");	// 정렬된 My_arr 배열 출력
		}
		System.out.println();
		
	}
	
	static void Bubble_sort (int arr[], int n) {	// 버블정렬
		int temp;
		for(int i=0 ; i<n-1; i++) {
			for(int j=i+1 ; j<n ; j++) {
				if(arr[i] > arr[j]) {		
					temp=arr[i]; arr[i]=arr[j]; arr[j]=temp; 
				}
			}
		}
	}
}
