
package Model;


public class DAOCliente {
    public Cliente Insertar(String dni, String nombres, String paterno, String materno){
        String q = "INSERT INTO Clientes VALUES ('"+dni+"', '"+nombres+"', '"+paterno+"', '"+materno+"')";
        if (new Database().Actualizar(q)>0) {
            return new Cliente(dni, nombres, paterno, materno);            
        }
        return null;
    }
    
}
