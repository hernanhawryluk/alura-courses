import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String name = "Tony Stark";
        String accountType = "current account";
        double balance = 1599.99;
        Scanner keyboard = new Scanner(System.in);
        int option = 0;

        System.out.println("*******************************");
        System.out.println("\nClient's name: " + name);
        System.out.println("Balance: " + balance);

        String menu = """
                
                *** Write the number of the desired option ***
                1 - Check balance.
                2 - Withdraw.
                3 - Deposit.
                9 - Exit
                """;

        while (option != 9) {
            option = 0;
            System.out.println(menu);
            if (keyboard.hasNextInt()) {
                option = keyboard.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                keyboard.next();
            }

            switch (option) {
                case 1:
                    System.out.println("The updated balance is: $ " + balance + ".");
                    break;

                case 2:
                    System.out.println("What amount do you want to withdraw?");
                    if (keyboard.hasNextDouble()) {
                        double toWithdraw = keyboard.nextDouble();
                        if (balance >= toWithdraw) {
                            balance = balance - toWithdraw;
                            System.out.println("Withdraw successfully!");
                            System.out.println("The updated balance is: $ " + balance + ".");
                        } else {
                            System.out.println("Withdraw failed!");
                            System.out.println("The balance is insufficient.");
                        }
                        break;
                    } else {
                        System.out.println("Invalid input!");
                        System.out.println("Going back to the main menu.");
                        keyboard.next();
                        break;
                    }

                case 3:
                    System.out.println("What amount do you want to deposit?");
                    if (keyboard.hasNextDouble()) {
                        double toDeposit = keyboard.nextDouble();
                        balance = balance + toDeposit;
                        System.out.println("Deposit successfully!");
                        System.out.println("The updated balance is: $ " + balance + ".");
                        break;
                    } else {
                        System.out.println("Invalid input!");
                        System.out.println("Going back to the main menu.");
                        keyboard.next();
                        break;
                    }

                case 9:
                    System.out.println("Exiting the program...");
                    System.out.println("Thanks for using our services.");
                    return;
                default:
                    System.out.println("Invalid option!");
                    System.out.println("Please choose a valid option.");
            }

        }
    }
}
