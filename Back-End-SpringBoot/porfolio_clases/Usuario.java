package porfolio;

/**
 * Class usuario
 */
public class Usuario extends Controlador {

  //
  // Fields
  //

  private String mail;
  private String password;
  
  //
  // Constructors
  //
  public Usuario () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of mail
   * @param newVar the new value of mail
   */
  public void setMail (String newVar) {
    mail = newVar;
  }

  /**
   * Get the value of mail
   * @return the value of mail
   */
  public String getMail () {
    return mail;
  }

  /**
   * Set the value of password
   * @param newVar the new value of password
   */
  public void setPassword (String newVar) {
    password = newVar;
  }

  /**
   * Get the value of password
   * @return the value of password
   */
  public String getPassword () {
    return password;
  }

  //
  // Other methods
  //

}
