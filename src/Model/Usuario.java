
package Model;

public class Usuario {
    private String dni;
    private String paterno;
    private String materno;
    private String nombres;
    private String tipo;
    private String correo;
    private String clave;   
    

    public Usuario() {
    }

    public Usuario(String dni, String paterno, String materno, String nombres, String tipo, String correo, String clave) {
        this.dni = dni;
        this.paterno = paterno;
        this.materno = materno;
        this.nombres = nombres;
        this.tipo = tipo;
        this.correo = correo;
        this.clave = clave;
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

    public String getTipo() {
        return tipo;
    }

    public String getCorreo() {
        return correo;
    }

    public String getClave() {
        return clave;
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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
}
