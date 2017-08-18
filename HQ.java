/**>
 * Esta clase realiza todas las operaciones de busqueda y agrega elementos de determinados tipos de objeto (Evento, Actividad, Restaurante, Hotel)
 * En esta clase se ejecuta una parte de las funcionalidades del programa. 
 * @author Francisco Molina
 * @version 17.8.17 (V1.0)
 */
import java.util.ArrayList;
public class HQ{
	ArrayList<Restaurante> listaRes;
	ArrayList<Hotel> listaHotel;
	Restaurante restaurante= new Restaurante();
	Hotel hotel= new Hotel();
	//ArrayList<Actividad> listaAct;
	/**
	 * Constructor para objetos de tipo HQ.
	 */
	public HQ() {
		ArrayList listaRes= new ArrayList<Restaurante>();
		ArrayList listaHotel= new ArrayList<Hotel>();
		//ArrayList listaEventos= new ArrayList<Eventos>();
		//ArrayList listaAct= new ArrayList<Actividades>();
	}
	public void addRes(String nombre, String horario, String descripcion, String direccion, String telefono, double calificacion) {
		Restaurante x= new Restaurante(nombre, horario, descripcion, direccion, telefono, calificacion);
		listaRes.add(x);
	}
	public void addH(String nombre, String correo, String horario, String descripcion, String direccion, String telefono, double calificacion) {
		Hotel x= new Hotel(nombre, correo, horario, descripcion, direccion, telefono, calificacion);
		listaHotel.add(x);
	}
	public void busquedaRes(String nombre) {
		for (Restaurante cont: listaRes) {
			if(cont.getNombre().equals(nombre)) {
				cont.toString();
			}
	}
	}
	public void busquedaHoteles(String nombre) {
		for (Hotel cont: listaHotel) {
			if(cont.getNombre().equals(nombre)) {
				cont.toString();
			}
	}
	}
	/**
	public void busquedaAct(String nombre) {
		for (Actividad cont: listaAct) {
			if(cont.getNombre().equals(nombre)) {
				cont.toString();
			}
	}
	}
	*/
	
	/**
	 * Metodo que agrega calificacion a objetos de tipo Hotel
	 * @param nombre: nombre del hotel
	 * @param calificacion: calificacion que desea darle el usuario al hotel
	 */
	public void calificacionH(String nombre,double calificacion) {
		for (Hotel cont: listaHotel) {
			if(cont.getNombre().equals(nombre)) {
				double x= calificacion;
				cont.setCalificacion(x);
			} else {
				System.out.println("Error 005: El hotel que usted busca calificar no se encuentra en la base de datos");
			}
		}
	}
	/**
	 * Metodo que agrega calificacion a objetos de tipo restaurante
	 * @param nombre: nombre del restaurante
	 * @param calificacion: calificacion que desea darle el usuario al restaurante
	 */
	public void calificacionR(String nombre,double calificacion) {
		for (Restaurante cont: listaRes) {
			if(cont.getNombre().equals(nombre)) {
				double x= calificacion;
				cont.setCalificacion(x);
			} else {
				System.out.println("Error 005: El hotel que usted busca calificar no se encuentra en la base de datos");
			}
		}
	}
	/**
	 * Metodo que elimina objetos de tipo Hotel, si no lo encuentra mostrara msj de error.
	 * @param nombre: nombre del hotel que desea eliminarse.
	 */
	public void delH(String nombre) {
		for (Hotel cont: listaHotel) {
			if(cont.getNombre().equals(nombre)) {
				int index=listaHotel.indexOf(nombre);
				listaHotel.remove(index);
			}else {
				System.out.println("Error 005: El hotel que usted busca eliminar no se encuentra en la base de datos");
			} 
			}
	}
	/**
	 * Metodo que elimina objetos de tipo restaurante, si no lo encuentra mostrara msj de error.
	 * @param nombre: nombre del restaurante que desea eliminarse.
	 */
	public void delRes(String nombre) {
		for (Restaurante cont: listaRes) {
			if(cont.getNombre().equals(nombre)) {
				int index=listaRes.indexOf(nombre);
				listaRes.remove(index);
			}else {
				System.out.println("Error 005: El restaurante que usted busca eliminar no se encuentra en la base de datos");
			} 
			}
	}
	/**
	 * Recorre toda la lista e imprime todos sus elementos.
	 * @return retorna los objetos que contiene la lista. 
	 */
	public String busquedaGeneralR() {
		String devolver="";
		for(Restaurante cont: listaRes) {
			String x=cont.toString();
			String separador="*****************************************";
			devolver=x+"\n"+separador+"\n";
		}
		return devolver;
	}
}
