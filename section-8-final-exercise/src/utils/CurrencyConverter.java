package utils;

public class CurrencyConverter {
    public double dollarPrice;
    public double dollarWillBeBought;

    public double amountToBePaidInReais() {
        return dollarPrice * (dollarWillBeBought + dollarWillBeBought * 0.06);
    }

    public String toString() {
        return "Amount to be paid in reais = " + String.format("%.2f%n", amountToBePaidInReais());
    }
}
