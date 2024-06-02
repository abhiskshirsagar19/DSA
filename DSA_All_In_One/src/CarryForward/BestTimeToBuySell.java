package CarryForward;

/*
 Say you have an array, A, for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), 
design an algorithm to find the maximum profit.

Return the maximum possible profit.
  */
public class BestTimeToBuySell {
	public int getMaxProfit(int A[]) {

		int buy = A[0];
		int sell = A[0];
		for (int i = 0; i < A.length; i++) {
			if (A[i] < buy) {
				buy = A[i];
			}
			if (sell < A[i]) {
				sell = A[i];
			}
		}
		int maxProfit = sell - buy;
		System.out.println(maxProfit);
		return maxProfit;
		// Problem in this approach is that if day 1 stock price is more
	}

	public int getMaximumProfit(int A[]) {
		int maxProfit = 0;
		for (int i = A.length - 1; i > 0; i--) {

			for (int j = i - 1; j >= 0; j--) {
				int profit = A[i] - A[j];
				if (maxProfit < profit) {
					maxProfit = profit;
				}
			}
		}

		return maxProfit;
	}

	public int getMaxProfitOptimize(int A[]) {
		int maxProfit = 0;
		int minPrice = Integer.MAX_VALUE;
		for (int i = 0; i < A.length; i++) {
			int currentPrice = A[i];
			if (currentPrice < minPrice) {
				minPrice = currentPrice;
			}
			int profit = currentPrice - minPrice;
			if (maxProfit < profit) {
				maxProfit = profit;
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BestTimeToBuySell bst = new BestTimeToBuySell();
		int A[] = { 1, 4, 5, 2, 4 };
		int B[] = { 1, 2 };
		int C[] = { 10, 20, 4, 5, 6, 7, 9 };
		int maximumPrfit = bst.getMaximumProfit(C);
		System.out.println("The maximum profit : " + maximumPrfit);

	}

}
