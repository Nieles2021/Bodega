
package Model;

public class Usuario {
    private String dni;
    private String paterno;
    private String materno;
    private String nombres;
    private String correo;
    private String clave;
    private String tipo;
    

    public Usuario() {
    }

    public Usuario(String dni, String paterno, String materno, String nombres, String correo, String clave, String tipo) {
        this.dni = dni;
        this.paterno = paterno;
        this.materno = materno;
        this.nombres = nombres;
        this.correo = correo;
        this.clave = clave;
        this.tipo = tipo;
    }

    public String getDni() {
        return dni;
    }

    public String getPaterno() {
        return paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public String getNombres() {
        return nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public String getClave() {
        return clave;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
    
    
}
