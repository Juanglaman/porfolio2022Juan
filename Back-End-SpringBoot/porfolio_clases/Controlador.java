package porfolio;


/**
 * Class controlador
 */
public class Controlador {

  //
  // Fields
  //

  private boolean verificar_usuario;
  private String cargar_persona;
  private String guardar_dato;
  private String borrar_dato;
  private String editar_dato;
  private Persona generar_persona;
  
  // SIMULANDO BASE De DATOS
        int BDnumID = 1;
        String BDnombre = "Juan";
        String BDApellido = "Anglada";
        String BDcorreo = "angl@juan";
        String BDSobreMi = "loren ipnsun";
        String BDFperfil = "www.fotoPerfil.com";
        String BDFbaner = "www.fotobnaer.com";
        String BDFfecha = "27/01/84";
        String BDDomicilio = "Calle 65";
        String BDTelefono = "221-4371";
  
  //
  // Constructors
  //
  public Controlador () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of verificar_usuario
   * @param newVar the new value of verificar_usuario
   */
  public void setVerificar_usuario (boolean newVar) {
    verificar_usuario = newVar;
  }

  /**
   * Get the value of verificar_usuario
   * @return the value of verificar_usuario
   */
  public boolean getVerificar_usuario () {
    return verificar_usuario;
  }

  /**
   * Set the value of cargar_persona
   * @param newVar the new value of cargar_persona
   */
  public void setCargar_persona (String newVar) {
    cargar_persona = newVar;
  }

  /**
   * Get the value of cargar_persona
   * @return the value of cargar_persona
   */
  public String getCargar_persona () {
    return cargar_persona;
  }

  /**
   * Set the value of guardar_dato
   * @param newVar the new value of guardar_dato
   */
  public void setGuardar_dato (String newVar) {
    guardar_dato = newVar;
  }

  /**
   * Get the value of guardar_dato
   * @return the value of guardar_dato
   */
  public String getGuardar_dato () {
    return guardar_dato;
  }

  /**
   * Set the value of borrar_dato
   * @param newVar the new value of borrar_dato
   */
  public void setBorrar_dato (String newVar) {
    borrar_dato = newVar;
  }

  /**
   * Get the value of borrar_dato
   * @return the value of borrar_dato
   */
  public String getBorrar_dato () {
    return borrar_dato;
  }

  /**
   * Set the value of editar_dato
   * @param newVar the new value of editar_dato
   */
  public void setEditar_dato (String newVar) {
    editar_dato = newVar;
  }

  /**
   * Get the value of editar_dato
   * @return the value of editar_dato
   */
  public String getEditar_dato () {
    return editar_dato;
  }

  /**
   * Set the value of generar_persona
   * @param newVar the new value of generar_persona
   */
  public void setGenerar_persona (Persona newVar) {
    generar_persona = newVar;
  }

  /**
   * Get the value of generar_persona
   * @return the value of generar_persona
   */
  public Persona getGenerar_persona () {
    return generar_persona;
  }

  //
  // Other methods
  //

}

