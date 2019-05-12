package Modelo;
import java.sql.*;

public class Conexion {
    public Conexion(){
        
    }
    
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost/baseSCRUM", "root", "n0m3l0");
        }catch (SQLException ex){
        }catch(Exception e){
        }   return con;
    }
}
