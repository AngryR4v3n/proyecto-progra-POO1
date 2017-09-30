/**
    * Modela las caracteristicas principales para poder un lugar turistico 
    * 
    * @author María Fernanda López, Francisco Molina
    * @version 13/09/2017
    
*/

public class LugarT{
	//Atributos 
	private String nombre;
	private String descripcion; 
	private String horario;
        private int c1;
        private int c2;
        private int c3;
        private int c4;
        private int c5;
	private String departamento;
        private double calificacion;

	
        /**
         * Constructor for objects of class LugarT
         * @param nombre
         * @param descripcion
         * @param horario
         * @param departamento 
         */
	public LugarT(String nombre, String descripcion, String horario, String departamento,int c1,int c2, int c3, int c4, int c5, double calificacion){
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.horario = horario;
		this.departamento=departamento;
                this.c1=c1;
                this.c2=c2;
                this.c3=c3;
                this.c4=c4;
                this.c5=c5;
                this.calificacion=calificacion;
	}

	/**
         * Metodo para obtener el nombre del lugar turistico
         * @return nombre del lugar turistico
         */
        public double getCalificacion(){
            return calificacion;
        }
        public void setCalificacion(double val){
            calificacion=val;
        }
        public int getC1(){
            return c1;
        }
        public void addC1(){
            c1 +=1;
        
        }
        public int getC2(){
            return c2;
        }
        public void addC2(){
            c2 +=1;
        
        }
        public int getC3(){
            return c3;
        }
        public void addC3(){
            c3+=1;
        
        }
        public int getC4(){
            return c4;
        }   
        public void addC4(){
            c4 +=1;
        }
        public int getC5(){
            return c5;
        }
        public void addC5(){
            c5 +=1;
        
        }

	public String getNombre(){
		return nombre;
	}
        
        /**
         * Metodo para obtener la descripcion del lugar turistico
         * @return descripcion del lugar turistico 
         */
	public String getDescripcion(){
		return descripcion;
	}
        
        /**
         * Metodo para obtener el horario del lugar turistico
         * @return horario del lugar
         */
        public String getHorario(){
		return horario;
	}
        
        /**
         * Metodo para obtener el departamento en donde se encuentra el lugar turistico
         * @return departamento
         */
	public String getDepartamento(){
		return departamento;
	}
        
        public String toString() {
			String msj = "Nombre: " + getNombre();
			String descrip= "Descripcion: " + getDescripcion() + "\nHorario: " + getHorario();
			String direc = "Departamento: " + getDepartamento();
			String msjCompleto= msj + "\n" + descrip+"\n"+direc;
			return msjCompleto;
		}
	
	

}