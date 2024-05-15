import java.util.List;
import java.util.Optional;

/**
 * Class Aparelho_Telefônico
 */
public class Aparelho_Telefônico implements AplicativoBasico {

  //
  // Fields
  //

  private List<Contato> listaContatos;
  
  //
  // Constructors
  //
  public Aparelho_Telefônico () { };


  //
  // Accessor methods
  //

  /**
   * Set the value of listaContatos
   * @param newVar the new value of listaContatos
   */
  public void setListaContatos (List<Contato> newVar) {
    listaContatos = newVar;
  }

  /**
   * Get the value of listaContatos
   * @return the value of listaContatos
   */
  public List<Contato> getListaContatos () {
    return listaContatos;
  }

  //
  // Other methods
  //

  /**
   * @param        contato
   */
  public void ligar(Contato contato)
  {
  }


  /**
   * @return       boolean
   */
  public boolean atender()
  {
    System.out.println("Atendendo telefone");
    return true;
  }


  /**
   */
  public void iniciarCorrerioVoz()
  {
    System.out.println("Iniciando correio de voz");
  }


  /**
   * @return       Contato
   */
  public Optional<Contato> selecionarContato()
  {
    System.out.println("Selecionando contato");

    Contato contato = null;

    return Optional.of(contato);
  }


  @Override
  public void abrir() {
    System.out.println("Abrindo aplicativo");
  }


  @Override
  public void fechar() {
    System.out.println("Fechando aplicativo");
  }
}
