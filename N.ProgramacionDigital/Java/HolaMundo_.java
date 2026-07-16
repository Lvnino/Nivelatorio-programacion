

import java.util.Scanner;
public class HolaMundo{

	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		Carro a = new Carro("Toyota","Blanca");
		a.estacionado();
		Carro b = new Carro("Mercedes","Negro");
		b.circulando();
		
	}
}
