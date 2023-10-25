package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Conexion {

    Connection conectar = null;
    
    String usuario = "root";
    
    String contrasena = "123456789";
    
    String db = "personal1";
    
    String ip = "localhost";
    
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + db;
    
    Statement st = null;
    
    ResultSet rs = null;
    
    public Connection establecerConeccion(){
        
        try{
            
            conectar = DriverManager.getConnection(cadena, usuario, contrasena);
            //JOptionPane.showMessageDialog(null, "Se conectó correctamente");
            /*
            
            st = conectar.createStatement();
            
            rs = st.executeQuery("SELECT * FROM CARRERAS");
            
            while(rs.next()){
                int idcarrera = rs.getInt(1);
                 System.out.println("ID de la carrera: " + idcarrera);
                 
                 String nombreCarrera = rs.getString(2);
                 System.out.println("Nombre de la carrera: " + nombreCarrera);
            }
            */
 
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Se producido un error" + e.toString());
        }
        return conectar;
    }
    
    //__________________________________________________________________________________________
    /*
    public void insertarDatos(){
        Connection con = establecerConeccion();
        
        if( con != null ){
            try{
                //Crear un objeto statement para ejecutar las consultas sql
                Statement statement = con.createStatement();
                //Crear una consulta INSERT para insertar datos en la tabla "carreras"
                String query = "INSERT INTO carreras(id, nombrecarrera) VALUES(4, 'Psicología')";
                //Ejecutamos la consulta de inserción
                statement.executeUpdate(query);
                System.out.println("Dato insertado correctamente");
                //Cerramos el statement y la conexión
                statement.close();
                con.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
*/
    
    //_________________________________________________________________________________
    
    /*
    public void actualizarDato(){
        //Establecer la conexion a la base de datos
        Connection con = establecerConeccion();
        
        if( con != null ){
            try{
                //creamos el objeto statement para ejecutar consulta sql
                Statement statement = con.createStatement();
                
                //Creamos la consulta
                String query = "UPDATE carreras SET nombrecarrera = 'Fisica' WHERE id = " + 1;
                
                //Ejecutamos la consulta de actualizacion
                statement.executeUpdate(query);
                
                //imprimimos
                System.out.println("Dato actualizado correctamente");
                
                //Cerramos el statement
                statement.close();
                
                con.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }   
    
    }
*/    
    //______________________________________________________________________________________________________
    /*
    public void consultarDatos(){
        //Establecemos la conexion
        Connection con = establecerConeccion();
        
        if( con != null ){
            try{
                //Creamos un objeto de Statement para ejecutar consultas SQL
                Statement statement = con.createStatement();
                
                //Ejecutar una consulta Select para obtener datos en la tabla "carreras
                ResultSet resultSet = statement.executeQuery("SELECT * FROM carreras");
                
                //Recorrer los resultados de la consulta
                while(resultSet.next()){
                    //Obtiene valores de las columnas por nombre y por indice
                    int id = resultSet.getInt("id");
                    String nombre = resultSet.getString("nombrecarrera");
                    
                    //Imprimos los valores de cada fila
                    System.out.println("ID: " +id + ", Nombre: " + nombre);
                    
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
    */
    
    //___________________________________________________________________________________
    
    /*
    public void eliminarDato(){
        Connection con = establecerConeccion();
        
        if( con != null ){
            try{
                
                Statement statement = con.createStatement();
                
                String query = "DELETE FROM carreras WHERE id = " + 3;
                
                statement.executeUpdate(query);
                
                System.out.println("Dato eliminado satisfactoriamente");
                
                statement.close();
                
                con.close();
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
*/
    
    //_______________________________________________________________________________________________
    
    //Insertar dato v2.0
    
    public void insertarDatos() throws SQLException{
        Connection con = establecerConeccion();
        
        if( con != null ){
            try{
                //Obtén el id y el nombre de la carrera a travez de JOptionPane
            String idStr = JOptionPane.showInputDialog("Ingrese el id a insertar");
            String nombreCarrera = JOptionPane.showInputDialog("Ingrese nueva carrera");
            
            int id = Integer.parseInt(idStr);
            
            //Crear un objeto statement para ejecutar la consulta sql
            Statement statement = con.createStatement();
            
            String query = "INSERT INTO carreras (id, nombrecarrera) VALUES (" +id + ", ' " + nombreCarrera + " ')";
            
            statement.executeUpdate(query);
            }catch(Exception e){
                e.printStackTrace();
                
            }
            
            
            
        }
    }
    
}
