package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

class Transaction {
    private double amount;
    private String currency;

    public Transaction(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() { return amount; }
    public String getCurrency() { return currency; }


    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(100.0, "USD"),
                new Transaction(50.0, "EUR"),
                new Transaction(200.0, "USD"),
                new Transaction(30.0, "GBP")
        );

        double total = transactions.stream()
                .filter(t -> t.getCurrency().equalsIgnoreCase("USD"))
                .mapToDouble(Transaction::getAmount).sum();
        System.out.println(total);

    }
}
