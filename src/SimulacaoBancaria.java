import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        boolean encerrarPrograma = false;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (encerrarPrograma == false) { 

            int opcao = scanner.nextInt(); 
        // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
        switch (opcao) {
            case 1: // Depositar
                double valorDeposito = scanner.nextDouble();
                saldo += valorDeposito; 
                System.out.println("Saldo atual: " + saldo);
                break;
            case 2: // Sacar
                double valorSaque = scanner.nextDouble();
                if (valorSaque > saldo) {
                    System.out.println("Saldo insuficiente.");
                } else {
                    saldo -= valorSaque; 
                    System.out.println("Saldo atual: " + saldo);
                }
                break;
            case 3: // Consultar Saldo
                System.out.println("Saldo atual: " + saldo);
                break;
            case 0: // Encerrar
                System.out.println("Programa encerrado.");
                encerrarPrograma = true;
                break;
        
              // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
              default:
                System.out.println("Opção inválida. Tente novamente."); 
            }
        }

        scanner.close();
    }
}
