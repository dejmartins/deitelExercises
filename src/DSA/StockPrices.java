package DSA;

public class StockPrices {
    public static void main(String[] args) {
        int[] stockPrices = {7, 6, 4, 3, 1};

        int maxProfit = 0;

        for (int i = 0; i < stockPrices.length - 1; i++){

            if (stockPrices[i] < stockPrices[i + 1]){
                maxProfit += stockPrices[i + 1] - stockPrices[i];
            }
        }

        System.out.println(maxProfit);
    }
}
