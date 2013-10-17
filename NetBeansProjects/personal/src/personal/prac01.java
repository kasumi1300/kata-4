package personal;

import java.io.*;//librerias necesarias para la entrada y salida.

class personal{
	private String nombre,apellidos,titulacion; //definimos variables.privadas.
	private int grupo;

	
	public personal(){//definimos el constructor personal que inicializara las variables.
		String nombre = "";
		String apellidos = "";
		String titulacion = "";
		int grupo=0;
	}
	public personal(String nombre,String apellidos,String titulacion,int grupo){
	//definimos contructor con parametros.modificara las minusculas por las mayusculas.
		this.nombre = nombre.toUpperCase();
		this.apellidos = apellidos.toUpperCase();
		this.titulacion = titulacion.toUpperCase();
		this.grupo = grupo;	
	}
	void muestra(){ //metodo que muestra los datos en pantalla.
		System.out.println("nombre:" + nombre);
		System.out.println("apellidos:" + apellidos);
		System.out.println("titulacion:" + titulacion);
		System.out.println("grupo:"+ grupo);
	}
}
class prac01{
   public static void main(String[] args)throws Exception {
      //pedimos linea a linea los datos.
		//pedimos al usuario el nombre.
		System.out.print("Introduce Nombre:");	
		BufferedReader linea1 = new BufferedReader(new InputStreamReader(System.in));
    	String nombre = linea1.readLine();
    	if (nombre.equals("")){
       	System.out.print("Error en los datos, vuelva a intentarlo.");
       	return;      
      }
    	//pedimos por pantalla los apellidos.
    	System.out.print("Introduce Apellidos:");
    	BufferedReader linea2 = new BufferedReader(new InputStreamReader(System.in));
    	String apellidos = linea2.readLine();
    	if (apellidos.equals("")){
       	System.out.print("Error en los datos, vuelva a intentarlo.");
       	return;      
      }
    	//pedimos por pantalla la titulacion.
    	System.out.print("Introduce Titulacion:");
    	BufferedReader linea3 = new BufferedReader(new InputStreamReader(System.in));
    	String titulacion = linea3.readLine();
    	if (titulacion.equals("")){
       	System.out.print("Error en los datos, vuelva a intentarlo.");
       	return;      
      }
    	//pedimos al usuario el grupo y lo convertimos de string a un entero.
    	System.out.print("Introduce numero de grupo:");
    	BufferedReader linea4 = new BufferedReader(new InputStreamReader(System.in));
    	String grup = linea4.readLine();
    	int grupo = Integer.parseInt(grup);
    
    	//creamos el objeto persona y definimos los parametros.
    	personal persona = new personal(nombre,apellidos,titulacion,grupo);
    	//llamamos al metodo muestra. para mostrar los datos de persona.
    	persona.muestra();			
	}	
};
