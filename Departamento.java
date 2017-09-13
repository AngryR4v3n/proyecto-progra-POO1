/**
    * Modela las caracteristicas de un departamento y su actividad turistica
    * 
    
    @author María Fernanda López, Francisco Molina
    @version 11/08/2017
    
*/

import java.util.ArrayList;

public class Departamento{
	private String nombre;
	private ArrayList<Hotel> hotelitos;
	private ArrayList<Restaurante> restaurante;
	private ArrayList<Actividad> actividad; 
	private ArrayList<Evento> evento; 
	private ArrayList<Lugar_t> lugar;

	/**
    *realiza la busqueda por nombre de un hotel, verifica si existe o no.
    *Si existe le muestra todos los datos al usuario de lo contrario tira error.
    *@param nombre hotel

    */

    public void busquerHotel(String nombre){
    	Iterator<Hotel> it = hotelitos.iterator();
    	String nombre = "";
    	while(it.hasNext()){
    		Hotel hotel = it.next();
    		if(hotel.getNombre.equals(nombre)){
    			nombre = hotel.toString();
    		}else{
    			System.out.println("El hotel no existe");
    		}
    	}

    }

    /**
    *realiza la busqueda por nombre de un restaurante, verifica si existe o no.
    *Si existe le muestra todos los datos al usuario de lo contrario tira error.
    *@param nombre restaurante

    */

    public void busquerRes(String nombre){
    	Iterator<Restaurante> it = restaurantes.iterator();
    	String nombre = "";
    	while(it.hasNext()){
    		Restaurante restaurante = it.next();
    		if(restaurante.getNombre.equals(nombre)){
    			nombre = restaurante.toString();
    		}else{
    			System.out.println("El restaurante no existe");
    		}
    	}

    }

    /**
    *realiza la busqueda por nombre de un evento, verifica si existe o no.
    *Si existe le muestra todos los datos al usuario de lo contrario tira error.
    *@param nombre hotel

    */

    public void busquerEvento(String nombre){
    	Iterator<Evento> it = eventos.iterator();
    	String nombre = "";
    	while(it.hasNext()){
    		Evento evento = it.next();
    		if(evento.getNombre.equals(nombre)){
    			nombre = evento.toString();
    		}else{
    			System.out.println("El evento no existe");
    		}
    	}

    }

    /**
    *realiza la busqueda por tipo de una actividad, verifica si existe o no.
    *Si existe le muestra todos los datos al usuario de lo contrario tira error.
    *@param tipo actividad

    */

    public void busquerAct(String tipo){
    	Iterator<Actividad> it = actividades.iterator();
    	ArrayList<Actividad> coleccion = new ArrayList<Actividad>();//acts con el tipo
    	while(it.hasNext()){
    		Actividad actividad = it.next();
    		String tipos = actividad.getTipo();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(tipos.indexOf(tipo)!= -1){
    			coleccion.add(actividad);
    		}else{
    			System.out.println("El hotel no existe");
    		}
    	}
    	return coleccion;
    }


    /**
    *realiza la busqueda por nombre de un lugar turistico, verifica si existe o no.
    *Si existe le muestra todos los datos al usuario de lo contrario tira error.
    *@param nombre hotel

    */

    public void busquerLugar(String nombre){
    	Iterator<Lugar_t> it = lugares.iterator();
    	String nombre = "";
    	while(it.hasNext()){
    		Lugar_t lugar = it.next();
    		if(lugar.getNombre.equals(nombre)){
    			nombre = lugar.toString();
    		}else{
    			System.out.println("El hotel no existe");
    		}
    	}

    }






}
