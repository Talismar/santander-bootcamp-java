import java.util.Scanner;

abstract class Cofre {
  protected String tipo;
  protected String metodoAbertura;

  public Cofre(String tipo, String metodoAbertura) {
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public void imprimirInformacoes() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
  }
}

class CofreDigital extends Cofre {

  private int senha;

  public CofreDigital(int senha) {
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }

  public boolean validarSenha(int confirmacaoSenha) {
    return confirmacaoSenha == this.senha;
  }
}

class CofreFisico extends Cofre {

  public CofreFisico() {
    super("Cofre Fisico", "Chave");
  }

}

public class Desafio2 {
  public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);
    String tipoCofre = scanner.nextLine();
    
    // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
    if (tipoCofre.equalsIgnoreCase("digital")) {
      // Lê a senha do cofre (segunda linha da entrada)
      int senha = scanner.nextInt();

      // TODO: Crie um objeto do tipo CofreDigital, passando a senha como argumento:
      CofreDigital cofreDigital = new CofreDigital(senha);

      // Lê a senha de confirmação do cofre (terceira linha da entrada)
      int confirmacaoSenha = scanner.nextInt();

      // TODO: Chame o método validarSenha, passando a senha de confirmação como argumento:
      boolean senhaValida = cofreDigital.validarSenha(confirmacaoSenha);

      // TODO: Imprima uma mensagem informando se a senha é válida ou não:
      cofreDigital.imprimirInformacoes();
      if (senhaValida) {
        System.out.println("Cofre aberto!");
      } else {
        System.out.println("Senha incorreta!");
      }
    } else {
      CofreFisico cofreFisico = new CofreFisico();
      cofreFisico.imprimirInformacoes();
    }

    scanner.close();
  }
}