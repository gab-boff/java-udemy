package application;

import utils.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        CurrencyConverter currencyConverter = new CurrencyConverter();

        System.out.print("What is the dollar price: ");
        currencyConverter.dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought: ");
        currencyConverter.dollarWillBeBought = sc.nextDouble();

        System.out.println(currencyConverter);

        sc.close();
    }
}
