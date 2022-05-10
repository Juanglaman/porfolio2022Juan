package porfolio;

/**
 * Class proyectos
 */
public class Proyectos {

  //
  // Fields
  //

  private int id_proyect;
  private String nombre_proyecto;
  private String descripcion_proyecto;
  private String fecha_inicio_proyecto;
  private String fecha_fin_proyecto;
  private String url_foto;
  private String link;
  private int id_persona;
  
  //
  // Constructors
  //
  public Proyectos (int id, String nom, String desc, String fec, String fecFin, String Foto, String L, int id_pers) {
      this.id_proyect = id;
      this.nombre_proyecto = nom;
      this.descripcion_proyecto = desc;
      this.fecha_inicio_proyecto = fec;
      this.fecha_fin_proyecto = fecFin;
      this.url_foto = Foto;
      this.link = L;
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
    id_proyect = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public int getId () {
    return id_proyect;
  }

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre_proyecto = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre_proyecto;
  }

  /**
   * Set the value of descripcion
   * @param newVar the new value of descripcion
   */
  public void setDescripcion (String newVar) {
    descripcion_proyecto = newVar;
  }

  /**
   * Get the value of descripcion
   * @return the value of descripcion
   */
  public String getDescripcion () {
    return descripcion_proyecto;
  }

  /**
   * Set the value of fecha_inicio
   * @param newVar the new value of fecha_inicio
   */
  public void setFecha_inicio (String newVar) {
    fecha_inicio_proyecto = newVar;
  }

  /**
   * Get the value of fecha_inicio
   * @return the value of fecha_inicio
   */
  public String getFecha_inicio () {
    return fecha_inicio_proyecto;
  }

  /**
   * Set the value of fecha_fin
   * @param newVar the new value of fecha_fin
   */
  public void setFecha_fin (String newVar) {
    fecha_fin_proyecto = newVar;
  }

  /**
   * Get the value of fecha_fin
   * @return the value of fecha_fin
   */
  public String getFecha_fin () {
    return fecha_fin_proyecto;
  }

  /**
   * Set the value of url_foto
   * @param newVar the new value of url_foto
   */
  public void setUrl_foto (String newVar) {
    url_foto = newVar;
  }

  /**
   * Get the value of url_foto
   * @return the value of url_foto
   */
  public String getUrl_foto () {
    return url_foto;
  }

  /**
   * Set the value of link
   * @param newVar the new value of link
   */
  public void setLink (String newVar) {
    link = newVar;
  }

  /**
   * Get the value of link
   * @return the value of link
   */
  public String getLink () {
    return link;
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

