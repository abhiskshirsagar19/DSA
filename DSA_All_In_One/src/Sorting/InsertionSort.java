package Sorting;

public class InsertionSort {
	public void insertionSort(int A[]) {
		int n = A.length;
		for (int i = 1; i < n; i++) {
			int temp = A[i];
			int j = i;
			while (j > 0 && A[j - 1] > temp) {
				A[j] = A[j - 1];
				j--;
			}
			A[j] = temp;
		}
		display(A);
	}

	public void display(int A[]) {
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
	}

	public static void main(String[] args) {
		InsertionSort ob = new InsertionSort();
		int A[] = { 1, 9, 3, 9, 2, 0, 1, 6, 4, 8, 7, 2, 5, 6 };
		ob.insertionSort(A);
	}

}
