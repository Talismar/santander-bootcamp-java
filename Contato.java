/**
 * Class Contato
 */
public class Contato {

  //
  // Fields
  //

  private int id;
  private String numero;
  private String nome;
  
  //
  // Constructors
  //
  public Contato () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (int newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public int getId () {
    return id;
  }

  /**
   * Set the value of numero
   * @param newVar the new value of numero
   */
  public void setNumero (String newVar) {
    numero = newVar;
  }

  /**
   * Get the value of numero
   * @return the value of numero
   */
  public String getNumero () {
    return numero;
  }

  /**
   * Set the value of nome
   * @param newVar the new value of nome
   */
  public void setNome (String newVar) {
    nome = newVar;
  }

  /**
   * Get the value of nome
   * @return the value of nome
   */
  public String getNome () {
    return nome;
  }

  //
  // Other methods
  //

}
