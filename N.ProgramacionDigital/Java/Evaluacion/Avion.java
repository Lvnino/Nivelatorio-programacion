public class Avion {
    private String aerolinea;
    private PersonaE a;
    private PersonaE b;
    private Motor t;

    // El constructor recibe solo lo necesario para la persona y la potencia
    public Avion(String aerolinea, PersonaE a,PersonaE b, Motor t) {
	this.aerolinea=aerolinea;
	this.a=a;
	this.b=b;
	this.t=t;
	}
	
	public Avion(String aerolinea) {
	this.aerolinea = aerolinea;
	t = new Motor(false);
	}

	public void despegar(){
		System.out.println("El avion a despegado");
	}
	public void aterrizaje(){
		System.out.println("El avion a aterrizado");
	}

	
	public void abordaje(PersonaE a, PersonaE b){
		this.a=a;
		this.b=b;
		this.a.abordaje();
		this.b.abordaje();
	}
	
	public void desembarque(){
		this.a.desembarque();
		this.b.desembarque();
	}
	public void encenderAvion(){
		this.t.cambiarEstado(true);
	}
	public void apagarAvion(){
		this.t.cambiarEstado(false);
	}
}

