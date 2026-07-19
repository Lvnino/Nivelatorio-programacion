public class Maleta{
	// las variables deben ser privadas para que PersonaE las pueda heredar
	private double peso;
	private String tipo;
	
	//Metodo: se recibe el peso y se clasifica el tipo
	public Maleta(double peso, String tipo){
		this.peso=peso;
		this.tipo=tipo;
	}
	public void automatizacionDeEquipaje(){

		if (peso <= 10.0){
			this.tipo="cabina";
		}else{
			this.tipo="Bodega";
		}
	}

	//Metodo: para mostrar la informacion ya clasificada
	public void mostrarMaleta(){
		System.out.println("peso de la maleta: "+peso+" kg");
		System.out.println("destino asignado: Maleta de "+tipo);
	}
}