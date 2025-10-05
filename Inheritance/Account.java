import java.util.Scanner;

/**
 * The Account class extends Bank and handles deposit and withdrawal operations.
 */
public class Account extends Bank {
    // A static Scanner to read input from the user for all Account objects.
    static Scanner sc = new Scanner(System.in);

    /**
     * Constructor for the Account class.
     * It calls the superclass (Bank) constructor to initialize the basic details.
     * @param n Name of the account holder.
     * @param a Account type.
     * @param pp Initial principal balance.
     */
    Account(String n, String a, double pp) {
        // Call the constructor of the superclass (Bank)
        super(n, a, pp);
    }

    /**
     * Handles the deposit logic.
     * It prompts the user for an amount and adds it to the balance.
     */
    void deposit() {
        System.out.print("\nEnter amount to deposit: ");
        double amt = sc.nextDouble();

        // **FIX 1:** A deposit should ADD to the balance (p), not subtract.
        // **FIX 2:** The original code had a misplaced semicolon (p=p-amt;.).
        if (amt > 0) {
            p = p + amt;
            System.out.println("Successfully deposited: " + amt);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    /**
     * Handles the withdrawal logic.
     * It checks for sufficient balance before allowing a withdrawal.
     * A penalty is applied if the balance falls below 500.
     */
    void withdraw() {
        System.out.print("\nEnter amount to withdraw: ");
        double amt = sc.nextDouble();

        if (amt <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return; // Exit the method
        }

        // Check if the withdrawal amount is greater than the available balance
        if (amt > p) {
            System.out.println("\n--- INSUFFICIENT BALANCE ---");
            System.out.println("Cannot withdraw " + amt + ". Your balance is only " + p);
        } else {
            // Deduct the amount
            p = p - amt;
            System.out.println("Successfully withdrew: " + amt);
            
            // Apply a penalty if the balance drops below the minimum requirement
            if (p < 500) {
                double penalty = (500 - p) / 10.0;
                p = p - penalty;
                System.out.println("Balance fell below 500. A penalty of " + penalty + " has been applied.");
            }
        }
    }

    /**
     * Displays the final account details.
     * Overrides the display method to show transaction-specific info if needed,
     * but mainly relies on the superclass display.
     */
    // **FIX 3:** The original display method was confusing.
    // It printed the last transaction amount (`amt`) instead of the total balance.
    // The super.display() already prints the correct balance (`p`).
    // This method is now simpler and just calls the parent's method.
    @Override
    void display() {
        // This now correctly displays the name, account type, and current balance.
        super.display();
    }
    public static void main(String[] args) {
        // Create a new account object
        Account myAccount = new Account("John Doe", "Savings", 1000.00);

        // Show initial details
        System.out.println("Account created.");
        myAccount.display();

        // Perform some transactions
        myAccount.deposit();
        myAccount.display();

        myAccount.withdraw();
        myAccount.display();

        // Try to withdraw more than the balance
        myAccount.withdraw();
        myAccount.display();
    }


}
