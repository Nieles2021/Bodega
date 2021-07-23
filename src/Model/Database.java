
package Model;

import java.sql.*;
import java.util.*;

public class Database {
    private final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final String URL = "jdbc:sqlserver://localhost:1433;databaseName=Bodega";
    private final String USER = "sa";
    private final String PASSWORD = "Nieles2021";
    
    private Connection conexion;
    
    public Database(){
        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }        
    }
    
    public int Actualizar(String consulta){
        try {
            Statement st = conexion.createStatement();
            return st.executeUpdate(consulta);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public List Ejectar(String consulta) {
        ResultSet rs = null;
        List resultado = new ArrayList();
        try {
            Statement st = conexion.createStatement();
            rs = st.executeQuery(consulta);
            resultado = AcomodarDatos(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }
    private List AcomodarDatos(ResultSet rs){
        List reglones = new ArrayList();
        try {
            int cantcolumnas = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Map<String, Object> reglon = new HashMap();
                for (int i = 1; i < cantcolumnas; i++) {
                    String nombrecampo = rs.getMetaData().getColumnName(i);
                    Object valor = rs.getObject(nombrecampo);
                    reglon.put(nombrecampo, valor);
                }
                reglones.add(reglon);
            }            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reglones;
    }
    public boolean EjecutarProcedimiento(String nombre){
        try {
          CallableStatement cs = conexion.prepareCall("{call " + nombre + "}");
          return  cs.execute();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
     public  void CerrarConexion(){
         try {
             conexion.close();;
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }
}
