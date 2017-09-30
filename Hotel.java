/**
 * Modela las caracteristicas de un hotel 
 * @author Maria Fernanda Lopez 17160, Francisco Molina 17050
 * @since 10/09/2017
 * @version 26/09/2017
 */
public class Hotel {
	
    private String nombre;
    private String correo;
    private String horario;
    private String descripcion;
    private String direccion;
    private String telefono;
    private int c1;
    private int c2;
    private int c3;
    private int c4;
    private int c5;
    private String departamento;
    private double cal;
		
    /**
    * El constructor de objetos de tipo Hotel con valores nulos.
    */
    public Hotel() {
        nombre="";
	correo="";
	horario="";
	descripcion="";
	direccion="";
	telefono="";
	c1=0;
        c2=0;
        c3=0;
        c4=0;
        c5=0;
	departamento="";
        cal=0;
    }
		
    /** Constructor de hoteles bajo determinados parametros
        * @param nombre: nombre del hotel
	* @param horario: horario de atencion
	* @param descripcion: breve descripcion del hotel
	* @param direccion: direccion donde se ubica
	* @param telefono: telefono de contacto.
	* @param calificacion: calificacion ingresada por el usuario.
    */
    public Hotel(String nombre, String correo, String horario, String descripcion, String direccion, String telefono, int c1,int c2, int c3, int c4, int c5, String departamento,double cal) {
	this.nombre=nombre;
	this.correo=correo;
	this.horario=horario;
	this.descripcion=descripcion;
	this.direccion=direccion;
	this.telefono=telefono;
	this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.c4=c4;
        this.c5=c5;
	this.departamento=departamento;
        this.cal=cal;
    }
    /**
        * @return: retorna nombre de hotel.
    */
    public void setCalificacion(double calf){ 
        cal=calf;
    }
    public double getCalificacion(){
        return cal;
    }
    public String getNombre() {
	return nombre;
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
    /**
	* @return: retorna nombre de hotel.
    */
    public String getHorario() {
	return horario;
    }
    /**
        * @return: retorna correo de hotel.
    */
    public String getCorreo() {
	return correo;
    }
    /**
        * @return: retorna descripcion del hotel.
    */
    public String getDescripcion() {
	return descripcion;
    }
    /**
        * @return: retorna telefono.
    */
    public String getTel() {
        return telefono;
    }
    /**
        * @return: retorna direccion.
    */
    public String getDireccion() {
	return direccion;
    }
    public String getDepartamento(){
	return departamento;
    }
    /**
        * @return retorna todos los datos del objeto en un string.
    */
    @Override
    public String toString() {
	String msj = "Nombre: " + getNombre() + " Direccion: " + getDireccion();
	String msj2 = "Correo: " + getCorreo() + " Telefono " + getTel();
	String descrip= "Descripcion: " + getDescripcion() + "\nHorario: " + getHorario();
	String direc = "Departamento: " + getDepartamento();
	String msjCompleto= msj+ "\n" + msj2+ "\n" + descrip+"\n"+direc;
	return msjCompleto;
    }

}