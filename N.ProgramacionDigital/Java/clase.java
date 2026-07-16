
// leer datos por consola

import java.util.Scanner;

//java-metodos

public class HolaMundo{

	public static void sumar(){
		System.out.println(10);
	}
	public static void suma(int a, int b){
		System.out.println(a+b);
	}

	public static int resta(int a, int b){
		return a-b;
	}

	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		System.out.println("escribe un texto"); 
		String mensaje = entrada.nextLine();
		System.out.println("escribe un numero"); 
		int valor = entrada.nextInt();

		System.out.println("HOLA MUNDOsadasdasda");      //imprimir por consola
		System.out.println("Segunda linea"); 
		int x;
		String y;
		x=5;
		if(x<10){
			System.out.println("x es menor que 10");
		}else{
			if(x==10){
				System.out.println("x es igual a 10");	
			
			}
		}     
 		while(x>0){
			System.out.println(x);
			x=x-1;
		}
		sumar();
		suma(4,8);
		System.out.println(resta(4,5)); 
	}
}
