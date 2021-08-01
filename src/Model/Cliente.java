
package Model;


public class Cliente {
    private String dni;
    private String nombres;
    private String paterno;
    private String materno;
    private String tipo;
    private String contra;

    public Cliente() {
    }

    public Cliente(String dni, String nombres, String paterno, String materno, String tipo, String contra) {
        this.dni = dni;
        this.nombres = nombres;
        this.paterno = paterno;
        this.materno = materno;
        this.tipo = tipo;
        this.contra = contra;
    }

    public String getDni() {
        return dni;
    }

    public String getNombres() {
        return nombres;
    }

    public String getPaterno() {
        return paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public String getTipo() {
        return tipo;
    }

    public String getContra() {
        return contra;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    
    
    

    
    
    
}
