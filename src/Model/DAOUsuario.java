
package Model;
import java.util.*;
import java.util.List;


public class DAOUsuario {

    public Usuario Insertar(String dni, String paterno, String materno, String nombres, String correo, String clave, String tipo){
        String q = "INSERT INTO Usuarios VALUES("
                + "'"+dni+"', '"+paterno+"','"+materno+"', '"+nombres+"', '"+correo+"', '"+clave+"', '"+tipo+"')";
        if (new Database().Actualizar(q)>0) {
            return new Usuario(dni, paterno, materno, nombres, correo, clave, tipo);            
        }
        return null;
    }
    /*
    public int Actualizar(int id, String usuario, String clave){
        String q = "UPDATE Usuarios SET Usuario='"
                + usuario + "' WHERE Id='"
                + id + "'";      
        return  new Database().Actualizar(q);
    }
    public Usuario ObtenerRegistro(int id){
        String q = "SELECT * FROM Usuarios WHERE Id='"
                + id +"'";
        List<Map> registros = new Database().Ejectar(q);
        Usuario usuario = null;
        for (Map registro : registros) {
            usuario = new Usuario((int)registro.get("Id"), (String)registro.get("Usuario"), (String)registro.get("Clave"));
        }
        return usuario;
    }
    public List ObtenerRegistros(){
        String q = "SELECT * FROM Usuarios";
        List<Map> registros = new Database().Ejectar(q);
        List<Usuario> usuarios = new ArrayList();
        for (Map registro : registros) {
            Usuario usuario = new Usuario((int)registro.get("Id"), (String)registro.get("Usuario"), (String)registro.get("Clave"));
            usuarios.add(usuario);
        }
        return usuarios;
    }
    public int Eliminar(int id){
        String q = "DELETE FROM Usuarios WHERE id='"+id+"'";
        return new Database().Actualizar(q);
    }
*/
            
    
    
}
