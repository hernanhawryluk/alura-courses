import com.alura.codingchallenge.models.CreditCard;
import com.alura.codingchallenge.models.Purchase;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Write the limit of the Credit Card:");
        double limit = prompt.nextDouble();
        CreditCard creditcard = new CreditCard(limit);

        int exit = 1;
        while (exit != 0) {
            System.out.println("Write the description of the purchase:");
            String description = prompt.next();

            System.out.println("Write the value of the purchase:");
            double value = Double.valueOf(prompt.next());

            Purchase purchase = new Purchase(value, description);
            boolean buyAttempt = creditcard.buyAttempt(purchase);

            if (buyAttempt) {
                System.out.println("Purchased successfully!");
                System.out.println("Write 0 to exit or 1 to continue");
                exit = prompt.nextInt();
            } else {
                System.out.println("Insufficient balance! Purchase cancelled.");
                exit = 0;
            }
        }

        Collections.sort(creditcard.getListOfPurchases());

        System.out.println("*********************");
        System.out.println("Purchased items:");
        for (Purchase purchase : creditcard.getListOfPurchases()) {
            System.out.println(purchase.getDescription() + " - " + purchase.getValue());
        }
        System.out.println("\n*********************");
        System.out.println("\nBalance of the Credit Card: " + creditcard.getBalance());

    }
}