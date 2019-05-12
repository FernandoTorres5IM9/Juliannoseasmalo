/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Fernando
 */
public class Usuario {
    String Nombre;
    String Contraseña;
    String Privilegio;
    
    public Usuario(){
        Nombre = "";
        Contraseña = "";
        Privilegio = "";
    }
    
    public String getNombre(){
        return Nombre;
    }
    public String getContraseña(){
        return Contraseña;
    }
    public String getPrivilegio(){
        return Privilegio;
    }
    
    public void setNombre(String nom){
        Nombre = nom;
    }
    public void setContraseña (String contra){
        Contraseña = contra;
    }
    public void setPrivilegio(String prive){
        Privilegio = prive;
    }
}
