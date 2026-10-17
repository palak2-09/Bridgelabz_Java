package Level1;

public class ProfitLoss {
    public static void main(String[] args){
        double costPrice=129;
        double sellingPrice=191;
        double profit=sellingPrice-costPrice;
        double profitPercentage=(profit/costPrice)*100;


        System.out.println("The cose price is INR "+costPrice+
                " and Selling Price is INR "+sellingPrice+
                "\nThe Profit is INR "+profit+
                " and the Profit Percentage is "+profitPercentage+"%");
    }
}
