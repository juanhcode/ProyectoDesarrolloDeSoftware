package Modelo;

public class docentes {

    private int documento;
    private String nombres;
    private String apellidos;
    private int telefono;
    private String correo;
    private String estudios;

    public docentes(int documento, String nombres, String apellidos, int telefono, String correo, String estudios) {
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
        this.estudios = estudios;
    }

    public docentes() { //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String aprellidos) {
        this.apellidos = aprellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    

}
