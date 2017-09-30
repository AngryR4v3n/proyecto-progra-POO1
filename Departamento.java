/**
    * Modela las caracteristicas de un departamento y su actividad turistica
    * 
    
    @author María Fernanda López, Francisco Molina
    @version 11/08/2017
    
*/

import java.util.ArrayList;
import java.util.Iterator;


public class Departamento{
	private String nombre;
        private Hotel miH;
	private ArrayList<Hotel> hotelitos;
	private ArrayList<Restaurante> restaurante;
	private ArrayList<Actividad> actividad; 
	private ArrayList<Evento> evento; 
	private ArrayList<LugarT> lugar;
        
        
        
        
        public Departamento(){
            hotelitos = new ArrayList<>();
            restaurante = new ArrayList<>();
            actividad = new ArrayList<>();
            evento = new ArrayList<>();
            lugar = new ArrayList<>();
            
            
            Hotel h1 = new Hotel("El paraiso", "paraiso@gmail.com", "Horario: 8:00 - 22:00", "Ambiente pacifico", "3-26 calle pachic, Alta Verapaz", "2208-6396", 0,0,0,0,0, "Alta Verapaz",0);
            hotelitos.add(h1);
            Hotel h2 = new Hotel("Casa San Carlos", "sanCarlosGT@gmail.com", "Horario: 00:00 - 22:00", "Cercania en toda la ciudad, comida de muy buena calidad", "Avenida las Americas, Guatemala", "2200-0000", 0,0,0,0,0, "Guatemala",0);
            hotelitos.add(h2);
            Hotel h3 = new Hotel("Grand Tikal Futura", "tikalGTM@gmail.com", "Horario: 04:30 - 23:00", "Habitaciones comodas. Excelente limpieza", "Calzada Roosevelt zona 11, Guatemala", "2528-6541", 0,0,0,0,0, "Guatemala",0);
            hotelitos.add(h3);
            Hotel h4 = new Hotel("Posada San Rafael", "serviciosSR@gmail.com", "Horario: 10:00 - 20:00", "Horario de entrada demasiado corto", "3-26 calle el portal, Santa Rosa", "7308-4326", 0,0,0,0,0, "Santa Rosa",0);
            hotelitos.add(h4);
            Hotel h5 = new Hotel("Utz Tzaba", "utzTzaba@gmail.com", "Horario: 05:40 - 22:10", "Cercania a la playa, buenos cocos!", "Aldea El Pumpo, Monterrico, Santa Rosa", "2600-0150", 0,0,0,0,0, "Santa Rosa",0);
            hotelitos.add(h5);
            Hotel h6 = new Hotel("Cavanna Inn", "cavannaBannana@gmail.com", "Horario: 00:30 - 18:00", "Buen precio", "Av Principal zona 7, Escuintla", "2528-4421", 0,0,0,0,0, "Escuintla",0);
            hotelitos.add(h6);
            
            
            
        }

        
   /**
    *realiza la busqueda por tipo de una actividad, verifica si existe o no.
    *Si existe le muestra todos los datos al usuario de lo contrario tira error.
    *@param departamento actividad
    */

    public String busquerAct(String departamento){
    	Iterator<Actividad> it = actividad.iterator();
        String datos = "";
    	ArrayList<Actividad> coleccion = new ArrayList<Actividad>();//acts con el tipo
    	while(it.hasNext()){
    		Actividad actividades = it.next();
    		String tipos = actividades.getTipo();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(tipos.indexOf(departamento)!= -1){
    			coleccion.add(actividades);
    		}
    	}
    	for(int i=0; i<coleccion.size(); i++){
            datos = coleccion.get(i).toString() + "\n" + datos;
        }
        
        return datos;
    }
    public int calificacionHBarra(String val,String nombre){
        int retorno=0;
        for (Hotel cont: hotelitos) {
            if (val.equals("1")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC1();
                    retorno =cont.getC1();
                }
        
            } else if (val.equals("2")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC2();
                    retorno =cont.getC2();
                
                }
            } else if (val.equals("3")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC3();
                    retorno =cont.getC3();   
                }
            } else if (val.equals("4")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC4();
                    retorno =cont.getC4();   
                }
            } else if (val.equals("5")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC5();
                    retorno =cont.getC5();   
                }
            }
        
        }
        return retorno;
    }

    public double calificacionHTotal(String nombre){
        double conteoT=0;
        for(Hotel cont: hotelitos){
            if(cont.getNombre().equals(nombre)){
                conteoT=cont.getC1()+cont.getC2()+cont.getC3()+cont.getC4()+cont.getC5();
            } 
        }
        return conteoT;
    }
    public int[] cantidadCH(String nombre){
        int vec[]=new int[5];
        for(Hotel cont: hotelitos){
            if(cont.getNombre().equals(nombre)){
                vec[0]=cont.getC1();
                vec[1]=cont.getC2();
                vec[2]=cont.getC3();
                vec[3]=cont.getC4();
                vec[4]=cont.getC5(); 
            }
        }
        return vec;
    }
    
    public double calificacionH(String nombre) {
            double calificacionReal=0;
            double numero=0;
		for (Hotel cont: hotelitos) {
			if(cont.getNombre().equals(nombre)) {
                            numero=cont.getC1()+cont.getC2()+cont.getC3()+cont.getC4()+cont.getC5();
                            calificacionReal=(cont.getC1()*1+cont.getC2()*2+cont.getC3()*3+cont.getC4()*4+cont.getC5()*5)/numero;
                            cont.setCalificacion(calificacionReal);
			}
		}
                return calificacionReal;
	}
    public int calificacionRBarra(String val,String nombre){
        int retorno=0;
        for (Restaurante cont: restaurante) {
            if (val.equals("1")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC1();
                    retorno =cont.getC1();
                }
        
            } else if (val.equals("2")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC2();
                    retorno =cont.getC2();
                
                }
            } else if (val.equals("3")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC3();
                    retorno =cont.getC3();   
                }
            } else if (val.equals("4")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC4();
                    retorno =cont.getC4();   
                }
            } else if (val.equals("5")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC5();
                    retorno =cont.getC5();   
                }
            }
        
        }
        return retorno;
    }
    public int[] cantidadCR(String nombre){
        int vec[]=new int[5];
        for(Restaurante cont: restaurante){
            if(cont.getNombre().equals(nombre)){
                vec[0]=cont.getC1();
                vec[1]=cont.getC2();
                vec[2]=cont.getC3();
                vec[3]=cont.getC4();
                vec[4]=cont.getC5(); 
            }
        }
        return vec;
    }
    public double calificacionR(String nombre) {
        double calificacionReal=0;
        double numero=0;
        for (Restaurante cont: restaurante) {
            if(cont.getNombre().equals(nombre)) {
                numero=cont.getC1()+cont.getC2()+cont.getC3()+cont.getC4()+cont.getC5();
                calificacionReal=(cont.getC1()*1+cont.getC2()*2+cont.getC3()*3+cont.getC4()*4+cont.getC5()*5)/numero;
                cont.setCalificacion(calificacionReal);
		}
		}
                return calificacionReal;
	}
    public double calificacionRTotal(String nombre){
        double conteoT=0;
        for(Hotel cont: hotelitos){
            if(cont.getNombre().equals(nombre)){
                conteoT=cont.getC1()+cont.getC2()+cont.getC3()+cont.getC4()+cont.getC5();
            }
        }
        return conteoT;
    }
        public int calificacionLBarra(String val,String nombre){
        int retorno=0;
        for (LugarT cont: lugar) {
            if (val.equals("1")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC1();
                    retorno =cont.getC1();
                }
        
            } else if (val.equals("2")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC2();
                    retorno =cont.getC2();
                
                }
            } else if (val.equals("3")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC3();
                    retorno =cont.getC3();   
                }
            } else if (val.equals("4")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC4();
                    retorno =cont.getC4();   
                }
            } else if (val.equals("5")){
                if(cont.getNombre().equals(nombre)){
                    cont.addC5();
                    retorno =cont.getC5();   
                }
            }
        
        }
        return retorno;
    }
    public double calificacionL(String nombre) {
        double calificacionReal=0;
        double numero=0;
        for (LugarT cont: lugar) {
            if(cont.getNombre().equals(nombre)) {
                numero=cont.getC1()+cont.getC2()+cont.getC3()+cont.getC4()+cont.getC5();
                calificacionReal=(cont.getC1()*1+cont.getC2()*2+cont.getC3()*3+cont.getC4()*4+cont.getC5()*5)/numero;
                cont.setCalificacion(calificacionReal);

            }
		}
                return calificacionReal;
	}
     public int[] cantidadCL(String nombre){
        int vec[]=new int[5];
        for(LugarT cont: lugar){
            if(cont.getNombre().equals(nombre)){
                vec[0]=cont.getC1();
                vec[1]=cont.getC2();
                vec[2]=cont.getC3();
                vec[3]=cont.getC4();
                vec[4]=cont.getC5(); 
            }
        }
        return vec;
    }
    public double calificacionLTotal(String nombre){
        double conteoT=0;
        for(LugarT cont: lugar){
            if(cont.getNombre().equals(nombre)){
                conteoT=cont.getC1()+cont.getC2()+cont.getC3()+cont.getC4()+cont.getC5();
            } 
        }
        return conteoT;
    }
    


    /**
     * Metodo para retornar una coleccion de hoteles que pertenecen a un departamento
     * @param departamento
     * @return un arraylist con los hoteles que pertenecen a ese departamento
     */    
    public String busquerHoteles(String departamento){
    	Iterator<Hotel> it = hotelitos.iterator();
        String datos="";
    	ArrayList<Hotel> coleccion = new ArrayList<Hotel>();//acts con el tipo
    	while(it.hasNext()){
    		Hotel hotel = it.next();
    		String depas = hotel.getDepartamento();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(depas.indexOf(departamento)!= -1){
    			coleccion.add(hotel);
    		}
    	}
    	for(int i=0; i<coleccion.size(); i++){
            datos = coleccion.get(i).toString() + "\n" + datos;
        }
        
        return datos;
    }
    
    /**
     * 
     * @param departamento
     * @return 
     */
    public String busquerRestaurante(String departamento){
    	Iterator<Restaurante> it = restaurante.iterator();
        String datos= "";
    	ArrayList<Restaurante> coleccion = new ArrayList<Restaurante>();//acts con el tipo
    	while(it.hasNext()){
    		Restaurante restaurante = it.next();
    		String depas = restaurante.getDepa();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(depas.indexOf(departamento)!= -1){
    			coleccion.add(restaurante);
    		}
    	}
    	for(int i=0; i<coleccion.size(); i++){
            datos = coleccion.get(i).toString() + "\n" + datos;
        }
        
        return datos;
    }
    
    
    public String busquerEvento(String departamento){
    	Iterator<Evento> it = evento.iterator();
        String datos="";
    	ArrayList<Evento> coleccion = new ArrayList<Evento>();//acts con el tipo
    	while(it.hasNext()){
    		Evento event = it.next();
    		String depas = event.getDepartamento();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(depas.indexOf(departamento)!= -1){
    			coleccion.add(event);
    		}
    	}
    	for(int i=0; i<coleccion.size(); i++){
            datos = coleccion.get(i).toString() + "\n" + datos;
        }
        
        return datos;
    }
    
    /**
     * 
     * @param departamento
     * @return 
     */
    public String busquerLugar(String departamento){
    	Iterator<LugarT> it = lugar.iterator();
        String datos = "";
    	ArrayList<LugarT> coleccion = new ArrayList<LugarT>();//acts con el tipo
    	while(it.hasNext()){
    		LugarT lugares = it.next();
    		String depas = lugares.getDepartamento();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(depas.indexOf(departamento)!= -1){
    			coleccion.add(lugares);
    		}
    	}
        
        for(int i=0; i<coleccion.size(); i++){
            datos = coleccion.get(i).toString() + "\n" + datos;
        }
        
        return datos;
    }
	
        
   
    
   /**
    * Metodo para buscar todos los nombre de los Hoteles de un determinado departamento
    * @param departamento
    * @return 
    */
     public ArrayList<Hotel> busquerNombreH(String departamento){
    	Iterator<Hotel> it = hotelitos.iterator();
    	ArrayList<Hotel> coleccion = new ArrayList<Hotel>();//acts con el tipo
    	while(it.hasNext()){
    		Hotel hotel = it.next();
    		String depas = hotel.getDepartamento();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(depas.indexOf(departamento)!= -1){
    			coleccion.add(hotel);
    		}
    	}
    	        
        return coleccion;
    }
     /**
    * Metodo para buscar todos los nombre de los Hoteles de un determinado departamento
    * @param departamento
    * @return 
    */
     public ArrayList<Hotel> getHotel(){
    	Iterator<Hotel> it = hotelitos.iterator();
    	ArrayList<Hotel> coleccion = new ArrayList<Hotel>();//acts con el tipo
    	while(it.hasNext()){
    		Hotel hotel = it.next();
    		String depas = hotel.getDepartamento();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		
    			coleccion.add(hotel);
    		
    	}
    	        
        return coleccion;
    }
    
    /**
     * Metodo para encontrar todos los nombres de eventos de un departamento
     * @param departamento
     * @return 
     */
     public ArrayList<Evento> buscarNombreE(String departamento){
    	Iterator<Evento> it = evento.iterator();
    	ArrayList<Evento> coleccion = new ArrayList<Evento>();//acts con el tipo
    	while(it.hasNext()){
    		Evento evento = it.next();
    		String depas = evento.getDepartamento();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(depas.indexOf(departamento)!= -1){
    			coleccion.add(evento);
    		}
    	}
    	        
        return coleccion;
    }
    
    /**
     * Metodo para buscar todos los nombres de actividad de un departamento
     * @param departamento
     * @return 
     */
     public ArrayList<Actividad> buscarNombreA(String departamento){
    	Iterator<Actividad> it = actividad.iterator();
    	ArrayList<Actividad> coleccion = new ArrayList<Actividad>();//acts con el tipo
    	while(it.hasNext()){
    		Actividad acts = it.next();
    		String depas = acts.getDepa();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(depas.indexOf(departamento)!= -1){
    			coleccion.add(acts);
    		}
    	}
    	        
        return coleccion;
    }
    
    /**
     * Metodo para buscar todos los nombres de restaurantes de un departamento
     * @param departamento
     * @return 
     */
     public ArrayList<Restaurante> buscarNombreR(String departamento){
    	Iterator<Restaurante> it = restaurante.iterator();
    	ArrayList<Restaurante> coleccion = new ArrayList<Restaurante>();//acts con el tipo
    	while(it.hasNext()){
    		Restaurante res = it.next();
    		String depas = res.getDepa();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(depas.indexOf(departamento)!= -1){
    			coleccion.add(res);
    		}
    	}
    	        
        return coleccion;
    }
      /**
     * Metodo para buscar todos  restaurantes 
     * @param departamento
     * @return 
     */
     public ArrayList<Restaurante> getRes(){
    	Iterator<Restaurante> it = restaurante.iterator();
    	ArrayList<Restaurante> coleccion = new ArrayList<Restaurante>();//acts con el tipo
    	while(it.hasNext()){
    		Restaurante res = it.next();
    		String depas = res.getDepa();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		
    			coleccion.add(res);
    		
    	}
    	        
        return coleccion;
    }
     
    /**
     * metodo para buscar el nombre de todos los lugares turisticos de un departamento
     * @param departamento
     * @return 
     */
     public ArrayList<LugarT> buscarNombreL(String departamento){
    	Iterator<LugarT> it = lugar.iterator();
    	ArrayList<LugarT> coleccion = new ArrayList<LugarT>();//acts con el tipo
    	while(it.hasNext()){
    		LugarT lugar = it.next();
    		String depas = lugar.getDepartamento();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(depas.indexOf(departamento)!= -1){
    			coleccion.add(lugar);
    		}
    	}
    	        
        return coleccion;
    }
     
    /**
     * metodo para buscar todos los lugares
     * @param departamento
     * @return 
     */
     public ArrayList<LugarT> getLugar(){
    	Iterator<LugarT> it = lugar.iterator();
    	ArrayList<LugarT> coleccion = new ArrayList<LugarT>();//acts con el tipo
    	while(it.hasNext()){
    		LugarT lugar = it.next();
    		
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		
    			coleccion.add(lugar);
    		
    	}
    	        
        return coleccion;
    }
     
         
     /**
      * Metodo para retornar toda la información de un hotel en especifico
      * @param nombre
      * @return 
      */
      public String infoHotel(String nombre){
    	Iterator<Hotel> it = hotelitos.iterator();
        String datos="";
    	while(it.hasNext()){
    		Hotel hotel = it.next();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(hotel.getNombre().equals(nombre)){
    			datos = hotel.toString();
    		}
    	}
    	        
        return datos;
    }
    
    /**
     * 
     * @param nombre
     * @return 
     */      
     public String infoEvento(String nombre){
    	Iterator<Evento> it = evento.iterator();
        String datos="";
    	while(it.hasNext()){
    		Evento evento = it.next();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(evento.getNombre().equals(nombre)){
    			datos = evento.toString();
    		}
    	}
    	        
        return datos;
    }
     
    /**
     * 
     * @param nombre
     * @return 
     */ 
     public String infoActividad(String nombre){
    	Iterator<Actividad> it = actividad.iterator();
        String datos="";
    	while(it.hasNext()){
    		Actividad act = it.next();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(act.getNombre().equals(nombre)){
    			datos = act.toString();
    		}
    	}
    	        
        return datos;
    }
     
    /**
     * 
     * @param nombre
     * @return 
     */
     public String infoRes(String nombre){
    	Iterator<Restaurante> it = restaurante.iterator();
        String datos="";
    	while(it.hasNext()){
    		Restaurante res = it.next();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(res.getNombre().equals(nombre)){
    			datos = res.toString();
    		}
    	}
    	        
        return datos;
    }
    
    /**
     * 
     * @param nombre
     * @return 
     */
     public String infoLugar(String nombre){
    	Iterator<LugarT> it = lugar.iterator();
        String datos="";
    	while(it.hasNext()){
    		LugarT lugares = it.next();
    		//se verifica si tipos tiene en su contenido el tipo buscado
    		if(lugares.getNombre().equals(nombre)){
    			datos = lugares.toString();
    		}
    	}
    	        
        return datos;
    }
     
    /**
     * Ordena el arreglo de hoteles por el que tiene calificacion más alta al que tiene calificacion mas baja
     * @return arreglo de la clase hotels
     */
     
     public Hotel[] convertiH (){
         Iterator<Hotel> it = hotelitos.iterator();
         int x = hotelitos.size();
         int y = 0;
         Hotel[] hoteles = new Hotel[x];
         while(it.hasNext()){
             Hotel hotel = it.next();
             for(int i=0; i<hotelitos.size();i++){
                hoteles[i] = hotelitos.get(i);
                y = hoteles.length;
             
         }
         }
         
         Hotel temp;
        //ordenar
        for (int i=0; i<y; i++){
            for (int j = i+1; j<y; j++){
                if(hoteles[i].getCalificacion() < hoteles[j].getCalificacion() ){
                    temp = hoteles[i];
                    hoteles[i] = hoteles[j];
                    hoteles[j] = temp;
                            
                }
            }
        }
        return hoteles;
         
     }
     
     /**
      * Ordena el arrelgo de restaurantes por el que tiene mayor calificacion hasta el qe tiene menor
      * @return arreglo de tipo restaurante 
      */
     
      public Restaurante[] convertirR (){
         Iterator<Restaurante> it = restaurante.iterator();
         int x = restaurante.size();
         int y = 0;
         Restaurante[] res = new Restaurante[x];
         while(it.hasNext()){
             Restaurante rest = it.next();
             for(int i=0; i<restaurante.size();i++){
                res[i] = restaurante.get(i);
                y = res.length;
             
         }
         }
         
        Restaurante temp;
        //ordenar
        for (int i=0; i<y; i++){
            for (int j = i+1; j<y; j++){
                if(res[i].getCalificacion() < res[j].getCalificacion() ){
                    temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                            
                }
            }
        }
        return res;
         
     }
      
      public LugarT[] convertirL (){
         Iterator<LugarT> it = lugar.iterator();
         int x = lugar.size();
         int y = 0;
         LugarT[] lugares = new LugarT[x];
         while(it.hasNext()){
             LugarT lu = it.next();
             for(int i=0; i<lugar.size();i++){
                lugares[i] = lugar.get(i);
                y = lugares.length;
             
         }
         }
         
        LugarT temp;
        //ordenar
        for (int i=0; i<y; i++){
            for (int j = i+1; j<y; j++){
                if(lugares[i].getCalificacion() < lugares[j].getCalificacion() ){
                    temp = lugares[i];
                    lugares[i] = lugares[j];
                    lugares[j] = temp;
                            
                }
            }
        }
        return lugares;
         
     }
     
     
    
     
    
    
    
    
}






