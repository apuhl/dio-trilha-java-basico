import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String name;
        int accountNumber;
        String agency;
        double balance;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter name: ");
        name = scanner.nextLine();

        System.out.println("Enter agency: ");
        agency = scanner.nextLine();

        System.out.println("Enter account number: ");
        accountNumber = scanner.nextInt();

        System.out.println("Enter initial account balance: ");
        balance = scanner.nextDouble();

        scanner.close();

        System.out.println("Hello " + name + ", thank you for creating a new account with our bank! Your agency is " + agency + ", account " + accountNumber + " with initial balance of " + balance + " for withdrawal");

    }
}
