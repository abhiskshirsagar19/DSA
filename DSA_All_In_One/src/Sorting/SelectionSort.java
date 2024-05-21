package Sorting;

public class SelectionSort {
	public void selectionSort(int A[]) {
		for (int i = 0; i < A.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < A.length; j++) {
				if (A[minIndex] > A[j]) {
					minIndex = j;
				}
			}
			int temp = A[minIndex];
			A[minIndex] = A[i];
			A[i] = temp;
		}
		display(A);
	}

	public void display(int A[]) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}

	public static void main(String args[]) {
		int Arr[] = { 5, 4, 8, 0, 3, 2, 1, 7, 6 };
		SelectionSort ss = new SelectionSort();
		ss.selectionSort(Arr);
	}
}
