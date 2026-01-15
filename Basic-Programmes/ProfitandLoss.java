public class ProfitandLoss{
    public static void main(String[] args){
	int cost_price = 129;
	int selling_price = 191;
	int Profit = selling_price - cost_price;
	double Profit_Percentage = (Profit / (double) cost_price) * 100;
	System.out.println("The Cost Price is INR " + cost_price + " and Selling Price is INR "+ selling_price);
	System.out.println("The Profit is INR " + Profit + " and the Profit Percentage is " + Profit_Percentage);
	}
}	