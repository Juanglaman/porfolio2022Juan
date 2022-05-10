package porfolio;


public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    
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
        
        
        int BDNum = 1;
        String BDN = "C.I.E.Y.A.";
        boolean Act = false;
        String FeIni = "12/10/2002";
        String FeFin = "01/04/2006";
        String Titulo = "Vendedor, atencion";
        String Descripcion = "Me desempeñaba como vendedor repositor en la casa de venta de prodctos electricos, dando consejos y aprendiendo.";
     
        int BDid_educacion = 1;
        String BDinstitucion = "Escuela Media N 2";
        String BDfecha_educacion = "2002";
        String BDtitulo_educacion = "Bachiller ciencias sociales";
        String BDdescripcion_educacion = "Secundaria transcurrida en la ciudad de Las Flores, provincia de Buenos Aires";
        int BDid_persona = 1;
        
        int BDid_Herramientas = 1;
        String BDnombre_herramienta = "HTML";
        int BDporcentaje = 85;
        int BDid_persona_herramienta = 1;
        
        int BDid_proyect = 1;
        String BDnombre_proyecto = "Huertas portal sol";
        String BDdescripcion_proyecto = "Pagina de huerta y cultivos";
        String BDfecha_inicio_proyecto = "2017";
        String BDfecha_fin_proyecto = "-";
        String BDurl_foto = "www.urlfoto.com";
        String BDlink = "www.huertasportalsol.com";
  
        //CONSTRUCTORES
        Persona p = new Persona(BDnumID, BDnombre, BDcorreo,BDSobreMi, BDFperfil, BDFbaner, BDFfecha, BDDomicilio, BDTelefono, BDApellido);
        ExperienciaLaboral e = new ExperienciaLaboral (BDNum, BDN, Act, FeIni, FeFin, Titulo, Descripcion);
        Educacion edu = new Educacion (BDid_educacion, BDinstitucion, BDfecha_educacion, BDtitulo_educacion, BDdescripcion_educacion, BDid_persona);
        Herramientas h = new Herramientas (BDid_Herramientas, BDnombre_herramienta, BDporcentaje, BDid_persona_herramienta);
        Proyectos pro = new Proyectos (BDid_proyect, BDnombre_proyecto, BDdescripcion_proyecto, BDfecha_inicio_proyecto, BDfecha_fin_proyecto, BDurl_foto, BDlink, BDid_persona);
        
        System.out.println("Nombre: " + p.getNombre() + " Apellido: " + p.getApellido());
        System.out.println("Trabajo " + e.getNombre() + " Puesto: " + e.getTitulo_puesto());
        System.out.println("Escuela: " + edu.getInstitucion() + ", año " + edu.getFecha());
        System.out.println("Herramienta: " + h.getNombre() + " porcentaje: " + h.getPorcentaje());
        System.out.println("Proyecto nombre: " + pro.getNombre() + " Link: " + pro.getLink());
       // System.out.println(ExperienciaLaboral.idpersona);
    }
    
    
}
