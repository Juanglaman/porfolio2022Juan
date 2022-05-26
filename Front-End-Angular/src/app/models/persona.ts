export interface Persona{
    id_per: number;
    nombre: String;
    apellido: String;
    domicilio: String;
    fecha_nacimiento: String;
    telefono: String;
    correo: String;
    sobre_mi: String;
    url_foto_perfil: String;
    url_foto_baner: String;
    /*expList:
      {
          id_exp: number;
          nombre_empresa: String;
          trabajoAct: Boolean;
          fecha_inicio: String;
          fecha_fin: String;
          descripcion: String;
          puesto: String;
          url_logo_empresa: String;
          id_persona: number;
      }

      {
          "id_exp": 2,
          "nombre_empresa": "Cinema La Plata",
          "trabajoAct": true,
          "fecha_inicio": "Marzo 2006",
          "fecha_fin": "Hasta la actualidad",
          "descripcion": "Operador de cine en Cinema La Plata",
          "puesto": "Operador",
          "url_logo_empresa": "logo_empresacinema.com",
          "id_persona": 1
      }
  ]*/
}
