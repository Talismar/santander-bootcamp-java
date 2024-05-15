import java.util.Optional;

/**
 * Class Repodutor_Musicial
 */
public class Repodutor_Musicial {

  //
  // Fields
  //

  private Musica listaMusicas;
  
  //
  // Constructors
  //
  public Repodutor_Musicial () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of listaMusicas
   * @param newVar the new value of listaMusicas
   */
  public void setListaMusicas (Musica newVar) {
    listaMusicas = newVar;
  }

  /**
   * Get the value of listaMusicas
   * @return the value of listaMusicas
   */
  public Musica getListaMusicas () {
    return listaMusicas;
  }

  //
  // Other methods
  //

  /**
   * @param        musica
   */
  public void tocar(Musica musica)
  {
    System.out.println("Tocando musica");
  }


  /**
   * @param        musica
   */
  public void pausar(Musica musica)
  {
    System.out.println("Pausando musica");
  }


  /**
   * @return       Musica
   */
  public Optional<Musica> selecionarMusica()
  {
    System.out.println("Selecionando musica");

    Musica musica = null;

    return Optional.of(musica);
  }


}
