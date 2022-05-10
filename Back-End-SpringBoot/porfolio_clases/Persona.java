package porfolio;

/**
 * Class persona
 */
public class Persona extends Controlador {

  //
  // Fields
  //

  private int id;
  private String nombre;
  private String correo;
  private String sobre_mi;
  private String url_foto_perfil;
  private String url_foto_baner;
  private String fecha_nacimiento;
  private String domicilio;
  private String telefono;
  private String apellido;
  
  //
  // Constructors
  //
  public Persona (int Num, String N, String Mail, String SobMi, String Fperfil, String Fbaner, String fecha, String domi, String tel, String ape) {
      this.id = Num;
      this.nombre = N;
      this.correo = Mail;
      this.sobre_mi = SobMi;
      this.url_foto_perfil = Fperfil;
      this.url_foto_baner = Fbaner;
      this.fecha_nacimiento = fecha;
      this.domicilio = domi;
      this.telefono = tel;
      this.apellido = ape;
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
   * Set the value of correo
   * @param newVar the new value of correo
   */
  public void setCorreo (String newVar) {
    correo = newVar;
  }

  /**
   * Get the value of correo
   * @return the value of correo
   */
  public String getCorreo () {
    return correo;
  }

  /**
   * Set the value of sobre_mi
   * @param newVar the new value of sobre_mi
   */
  public void setSobre_mi (String newVar) {
    sobre_mi = newVar;
  }

  /**
   * Get the value of sobre_mi
   * @return the value of sobre_mi
   */
  public String getSobre_mi () {
    return sobre_mi;
  }

  /**
   * Set the value of url_foto_perfil
   * @param newVar the new value of url_foto_perfil
   */
  public void setUrl_foto_perfil (String newVar) {
    url_foto_perfil = newVar;
  }

  /**
   * Get the value of url_foto_perfil
   * @return the value of url_foto_perfil
   */
  public String getUrl_foto_perfil () {
    return url_foto_perfil;
  }

  /**
   * Set the value of url_foto_baner
   * @param newVar the new value of url_foto_baner
   */
  public void setUrl_foto_baner (String newVar) {
    url_foto_baner = newVar;
  }

  /**
   * Get the value of url_foto_baner
   * @return the value of url_foto_baner
   */
  public String getUrl_foto_baner () {
    return url_foto_baner;
  }

  /**
   * Set the value of fecha_nacimiento
   * @param newVar the new value of fecha_nacimiento
   */
  public void setFecha_nacimiento (String newVar) {
    fecha_nacimiento = newVar;
  }

  /**
   * Get the value of fecha_nacimiento
   * @return the value of fecha_nacimiento
   */
  public String getFecha_nacimiento () {
    return fecha_nacimiento;
  }

  /**
   * Set the value of domicilio
   * @param newVar the new value of domicilio
   */
  public void setDomicilio (String newVar) {
    domicilio = newVar;
  }

  /**
   * Get the value of domicilio
   * @return the value of domicilio
   */
  public String getDomicilio () {
    return domicilio;
  }

  /**
   * Set the value of telefono
   * @param newVar the new value of telefono
   */
  public void setTelefono (String newVar) {
    telefono = newVar;
  }

  /**
   * Get the value of telefono
   * @return the value of telefono
   */
  public String getTelefono () {
    return telefono;
  }

  /**
   * Set the value of apellido
   * @param newVar the new value of apellido
   */
  public void setApellido (String newVar) {
    apellido = newVar;
  }

  /**
   * Get the value of apellido
   * @return the value of apellido
   */
  public String getApellido () {
    return apellido;
  }

  //
  // Other methods
  //

}

