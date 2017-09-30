
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * centro de operaciones para el usuario
 * @author Francisco Molina
 */
public class controladorUser {
    private ArrayList<Usuario> listaUser;
    private Usuario user;
    
    public controladorUser(){
        listaUser = new ArrayList<>();
        
    }
    public void crearUser(String mail, String nombre, String pw){
        Usuario nuevo = new Usuario(mail, nombre, pw);
        listaUser.add(nuevo);
    }
    public boolean comprobarDisp(String mail){
        int contador=0;
        boolean alerta=false;
        for(Usuario elem: listaUser){
            if(elem.getMail().equals(mail)){
                contador++;
            }
        }
        if(contador>1){
            alerta=true;
        }
        return alerta;
    }
    
}
