package Sorting;

public class BubbleSort {
	public void bubleSort(int A[]) {
		for (int i = 0; i < A.length; i++) {
			boolean swaped = false;
			for (int j = 0; j < A.length - 1 - i; j++) {
				if (A[j] > A[j + 1]) {
					int temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
					swaped = true;
				}
				if (!swaped) {
					break;
				}
			}
		}
		display(A);
	}

	public void display(int A[]) {
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i] + "  ");
		}
	}

	public static void main(String args[]) {
		int Arr[] = { 7, 1, 0, 2, 4, 6, 3, 5 };
		BubbleSort bs = new BubbleSort();
		bs.bubleSort(Arr);

	}
}
