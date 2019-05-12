/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.*;
/**
 *
 * @author Fernando
 */
public class UsuarioDAO {
    Conexion conexion;
    
    public UsuarioDAO(){
        conexion = new Conexion();
    }
    
    public Usuario verificaUsuario (String nom, String con){
        Usuario usuario = null;
        Connection accesoDB = conexion.getConexion();
        try{
            PreparedStatement ps = accesoDB.prepareStatement("select * from Usuario where Nombre=? and Contraseña=?");
            ps.setString(1,nom);
            ps.setString(2,con);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                usuario = new Usuario();
                usuario.setNombre(rs.getString(1));
                usuario.setContraseña(rs.getString(2));
                usuario.setPrivilegio(rs.getString(3));
                return usuario;
            }
        }catch(Exception e){
        }
        return usuario;
    }
}
