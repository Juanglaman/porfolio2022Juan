package porfolio;

/**
 * Class experiencia_laboral
 */
public class ExperienciaLaboral {

  //
  // Fields
  //

  private int id;
  private String nombre;
  private boolean trabajo_actual;
  private String fecha_inicio;
  private String fecha_fin;
  private String titulo_puesto;
  private String descripcion;
  private String url_logo_empresa;
  private Persona id_persona;
  
  //
  // Constructors
  //
  public ExperienciaLaboral (int Num, String N, boolean Act, String FeIni, String FeFin, String Titulo, String Descripcion) {
      this.id = Num;
      this.nombre = N;
      this.trabajo_actual = Act;
      this.fecha_inicio = FeIni;
      this.fecha_fin = FeFin;
      this.titulo_puesto = Titulo;
      this.descripcion = Descripcion;
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
   * Set the value of trabajo_actual
   * @param newVar the new value of trabajo_actual
   */
  public void setTrabajo_actual (boolean newVar) {
    trabajo_actual = newVar;
  }

  /**
   * Get the value of trabajo_actual
   * @return the value of trabajo_actual
   */
  public boolean getTrabajo_actual () {
    return trabajo_actual;
  }

  /**
   * Set the value of fecha_inicio
   * @param newVar the new value of fecha_inicio
   */
  public void setFecha_inicio (String newVar) {
    fecha_inicio = newVar;
  }

  /**
   * Get the value of fecha_inicio
   * @return the value of fecha_inicio
   */
  public String getFecha_inicio () {
    return fecha_inicio;
  }

  /**
   * Set the value of fecha_fin
   * @param newVar the new value of fecha_fin
   */
  public void setFecha_fin (String newVar) {
    fecha_fin = newVar;
  }

  /**
   * Get the value of fecha_fin
   * @return the value of fecha_fin
   */
  public String getFecha_fin () {
    return fecha_fin;
  }

  /**
   * Set the value of titulo_puesto
   * @param newVar the new value of titulo_puesto
   */
  public void setTitulo_puesto (String newVar) {
    titulo_puesto = newVar;
  }

  /**
   * Get the value of titulo_puesto
   * @return the value of titulo_puesto
   */
  public String getTitulo_puesto () {
    return titulo_puesto;
  }

  /**
   * Set the value of descripcion
   * @param newVar the new value of descripcion
   */
  public void setDescripcion (String newVar) {
    descripcion = newVar;
  }

  /**
   * Get the value of descripcion
   * @return the value of descripcion
   */
  public String getDescripcion () {
    return descripcion;
  }

  /**
   * Set the value of url_logo_empresa
   * @param newVar the new value of url_logo_empresa
   */
  public void setUrl_logo_empresa (String newVar) {
    url_logo_empresa = newVar;
  }

  /**
   * Get the value of url_logo_empresa
   * @return the value of url_logo_empresa
   */
  public String getUrl_logo_empresa () {
    return url_logo_empresa;
  }

  /**
   * Set the value of id_persona
   * @param newVar the new value of id_persona
   */
  public void setId_persona (Persona newVar) {
    id_persona = newVar;
  }

  /**
   * Get the value of id_persona
   * @return the value of id_persona
   */
  public Persona getId_persona () {
    return id_persona;
  }

  //
  // Other methods
  //

}

