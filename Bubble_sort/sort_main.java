package Bubble_sort;
import java.util.Scanner;

public class sort_main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	// ǥ�� �Է� Ŭ���� ����
		int n;				// �Է¹��� ������ ����  n ����
		int My_arr[];		// �Է¹��� ���ڸ� ������ �迭 My_arr ����
		
		System.out.print("n �� �Է� : ");	// ǥ�� ���
		n = sc.nextInt();		// ǥ�� �Է� Ŭ������ nextInt() �Լ��� n�� ���� ����
		
		My_arr = new int[n];	// My_arr �迭�� n ��ŭ ���� �Ҵ�
		
		System.out.print(n + " ���� ���� �Է� : ");	// ǥ�� ���
		for(int i=0; i<n ; i++) {			
			My_arr[i] = sc.nextInt();		// My_arr �迭�� n���� ���� �Է� 
		}
		
		Bubble_sort(My_arr, n);	// �����Լ� (Arrange) ȣ��
		
		System.out.print("���� ��� : ");	// ���
		for(int i=0; i<n ; i++) {			
			System.out.print(My_arr[i] + " ");	// ���ĵ� My_arr �迭 ���
		}
		System.out.println();
		
	}
	
	static void Bubble_sort (int arr[], int n) {	// ��������
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
