import java.util.Scanner;

public class PaymentValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter payment amount: ");
        double amount = scanner.nextDouble();

        // WRITE YOUR LOGIC HERE
        // Ask user to enter payment amount
        // If amount ≤ 0 → print "Invalid Amount"
        // If amount > 100000 → print "Amount exceeds limit"
        // Otherwise → print "Payment accepted"

        if(amount <= 0){
            System.out.println("Invalid Amount");
        }
        else if(amount > 100000) {
            System.out.println("Amount exceeds limit");
        }
        else
            System.out.println("Payment accepted");
        scanner.close();
    }
}
