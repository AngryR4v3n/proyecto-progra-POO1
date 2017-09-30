/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase que modela los atributos esenciales que un usuario debe tener.
 * @author Francisco Molina
 */
public class Usuario {
    String email;
    String pw;
    String nombre;
    /**
     * constructor nulo para usuarios
     */
    public Usuario(){
        email="";
        pw="";
        nombre="";
        
    }
    /**
     * constructor por overload, este crea un usuario con los parametros asignados
     * @param mail email asignado por el user, este debe ser unico
     * @param pass  contraseña ingresada por el user, la cadena debe ser mayor a 6 char.
     */
    public Usuario(String mail,String name, String pass){
        this.email= mail;
        this.pw= pass;
        this.nombre=name;
    }
    /**
     * obtiene mail solicitado
     * @return retorna el mail
     */
    public String getMail(){
        return email;
    }
    /**
     * obtiene password solicitada
     * @return retorna password
     */
    public String getPw(){
        return pw;
    }
    /**
     * obtiene nombre solicitado
     * @return retorna nombre
     */
    public String getName(){
        return nombre;
    }
    /**
     * imprime el objeto en caracteres.
     * @return el objeto y sus atributos.
     */
    public String UsertoString(){
        String msj;
        msj="Usuario: "+getName()+""+"Email: "+ getMail()+""+"Password: "+getPw();
        return msj;
    }
    
    
}
