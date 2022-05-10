package porfolio;


public class Educacion {

  //
  // Fields
  //

  private int id_educacion;
  private String institucion;
  private String fecha_educacion;
  private String titulo_educacion;
  private String descripcion_educacion;
  private int id_persona;
  
  //
  // Constructors
  //
  public Educacion (int id, String inst, String Fec, String titu, String desc, int id_pers) {
      this.id_educacion = id;
      this.institucion = inst;
      this.fecha_educacion = Fec;
      this.titulo_educacion = titu;
      this.descripcion_educacion = desc;
      this.id_persona = id_pers;
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
    id_educacion = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public int getId () {
    return id_educacion;
  }

  /**
   * Set the value of institucion
   * @param newVar the new value of institucion
   */
  public void setInstitucion (String newVar) {
    institucion = newVar;
  }

  /**
   * Get the value of institucion
   * @return the value of institucion
   */
  public String getInstitucion () {
    return institucion;
  }

  /**
   * Set the value of fecha
   * @param newVar the new value of fecha
   */
  public void setFecha (String newVar) {
    fecha_educacion = newVar;
  }

  /**
   * Get the value of fecha
   * @return the value of fecha
   */
  public String getFecha () {
    return fecha_educacion;
  }

  /**
   * Set the value of titulo
   * @param newVar the new value of titulo
   */
  public void setTitulo (String newVar) {
    titulo_educacion = newVar;
  }

  /**
   * Get the value of titulo
   * @return the value of titulo
   */
  public String getTitulo () {
    return titulo_educacion;
  }

  /**
   * Set the value of descripcion
   * @param newVar the new value of descripcion
   */
  public void setDescripcion (String newVar) {
    descripcion_educacion = newVar;
  }

  /**
   * Get the value of descripcion
   * @return the value of descripcion
   */
  public String getDescripcion () {
    return descripcion_educacion;
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


