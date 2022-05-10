package porfolio;

/**
 * Class tecnologia
 */
public class Herramientas {

  //
  // Fields
  //

  private int id_Herramientas;
  private String nombre;
  private int porcentaje;
  private int id_persona;
  
  //
  // Constructors
  //
   public Herramientas (int Num, String N, int porce, int id) {
      this.id_Herramientas = Num;
      this.nombre = N;
      this.porcentaje = porce;
      this.id_persona = id;
  };
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
    id_Herramientas = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public int getId () {
    return id_Herramientas;
  }

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of porcentaje
   * @param newVar the new value of porcentaje
   */
  public void setPorcentaje (int newVar) {
    porcentaje = newVar;
  }

  /**
   * Get the value of porcentaje
   * @return the value of porcentaje
   */
  public int getPorcentaje () {
    return porcentaje;
  }

  /**
   * Set the value of id_persona
   * @param newVar the new value of id_persona
   */
  public void setId_persona (int newVar) {
    id_persona = newVar;
  }

  /**
   * Get the value of id_persona
   * @return the value of id_persona
   */
  public int getId_persona () {
    return id_persona;
  }

  //
  // Other methods
  //

}

