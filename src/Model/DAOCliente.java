
package Model;


public class DAOCliente {
    public Cliente Insertar(String dni, String nombres, String paterno, String materno, String tipo, String contra){
        String q = "INSERT INTO Clientes VALUES ('"+dni+"', '"+nombres+"', '"+paterno+"', '"+materno+"', '"+tipo+"', '"+contra+"')";
        if (new Database().Actualizar(q)>0) {
            return new Cliente(dni, nombres, paterno, materno, tipo, contra);            
        }
        return null;
    }
    
}
