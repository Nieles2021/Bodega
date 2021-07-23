
package Model;

public class Usuario {
    private int id;
    private String usuario;
    private String clave;

    public Usuario() {
    }

    public Usuario(int id, String usuario, String clave) {
        this.id = id;
        this.usuario = usuario;
        this.clave = clave;
    }

    public int getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
}
