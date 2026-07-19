import java.util.Scanner;
public class Main{

	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		Avion avion1 = new Avion("avianca");
		PersonaE a = new PersonaE("Leidy Laguado","primera clase",9.80);
		
		PersonaE b = new PersonaE("Lina Niño","tercera clase",12.8);
	
		avion1.encenderAvion();
		avion1.abordaje(a,b);
		avion1.despegar();
		avion1.aterrizaje();
		avion1.desembarque();
		avion1.apagarAvion();
		
	}
}
