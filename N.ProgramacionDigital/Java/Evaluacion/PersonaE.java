public class PersonaE{
	// variables de persona
	private String nombre;
	private String clase;

	//Heredo: objeto maleta dentro de persona
	private Maleta m;

	//se reciben los datos de persona  y el peso de para craer maleta
	PersonaE(String nombre, String clase, double pesoMaleta){
		this.nombre=nombre;
		this.clase=clase;
	//creamos Maleta de la persona automáticamente con el peso
		this.m= new Maleta(pesoMaleta, " ");
	}
		

	//accion de abordaje
	public void abordaje(){
		System.out.println("la persona "+nombre+" de "+clase+" esta en abordaje");
		this.m.automatizacionDeEquipaje();
		this.m.mostrarMaleta();
	}

	//accion de desembarque
	public void desembarque(){
		System.out.println("la persona "+nombre+" de "+clase+" esta en desembarque");
		
	}

	//Método para mostrar los datos completos de la persona y su maleta
	public void mostrarPersonaE() {
   	System.out.println("Nombre: " + nombre);
    	System.out.println("Clase: " + clase);
	
	// Le dice a la maleta de esta persona que muestre la informacion ya clasificada
	m.mostrarMaleta();
		
	}
}

