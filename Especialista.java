public class Especialista extends Persona {

private String Registro;
private String Especialidad;

public Especialista (String Nombre, String Documento, String Telefono, String Direccion, String Correo){

    super(Nombre, Documento, Telefono, Direccion, Correo);
    
}

public String getRegistro() {
    return Registro;
}

public void setRegistro(String registro) {
    Registro = registro;
}

public String getEspecialidad() {
    return Especialidad;
}

public void setEspecialidad(String especialidad) {
    Especialidad = especialidad;
}

}
