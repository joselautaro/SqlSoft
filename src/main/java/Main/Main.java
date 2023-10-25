
package Main;

import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {
        Conexion con = new Conexion();
        
        //con.establecerConeccion();
        con.insertarDatos();
        //con.actualizarDato();
        //con.consultarDatos();
        //con.eliminarDato();
    }
    
}
