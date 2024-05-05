import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the my application");

        try {
            System.out.println("Please enter the Account number!");
            int accountNumber = scanner.nextInt();
    
            System.out.println("Please enter the Agency number!");
            String agencyNumber = scanner.next();
    
            System.out.println("Please enter the customer's name!");
            String customerName = scanner.next();
    
            System.out.println("Please enter the balance");
            double balance = scanner.nextDouble();
            System.out.println(balance);
    
            String formatString = "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque";
            System.out.println(String.format(formatString, customerName, agencyNumber, accountNumber, balance));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
