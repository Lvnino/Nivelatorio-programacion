public class Motor {
    // atributo privado (motor nace apagado)
    private boolean encendido = false; 

	public Motor(boolean encendido){
	this.encendido=encendido;
	}
	
    //Método Getter:para que el avión consulte el estado cuando lo necesite
    public boolean getEncendido() { 
        return this.encendido; 
    }
	
    // MÉTODO PRINCIPAL: Enciende o apaga el motor según el valor que reciba.
    public void cambiarEstado(boolean estado) {
        this.encendido = estado; // Guardamos el nuevo estado (true o false)
    
    // Si el estado es verdadero (true), el motor arranca
    if (this.encendido) {
	System.out.println("Motor ENCENDIDO");
            
    // Usamos la recursividad: calculamos 2 elevado a la 5 (2 * 2 * 2 * 2 * 2)
    int resultado = potencia(2, 5); 
	System.out.println("Propulsión alcanzada: " + resultado + " kW.");
            
	} else { // <- Aquí el 'else' conecta perfectamente si el 'if' es falso
    // Si el estado es falso (false), el motor se apaga
		System.out.println("Motor APAGADO");
        }
    } 

    // MÉTODO RECURSIVO: Calcula X elevado a la Y de forma repetitiva
    private int potencia(int x, int y) {
    // CASO BASE: Si el exponente llega a 0, paramos la recursividad y devolvemos 1
    if (y == 0) return 1; 
        
    // CASO RECURSIVO: Multiplica la base (X) por sí misma, restando 1 al exponente (Y)
	return x * potencia(x, y - 1); 
    }
}
