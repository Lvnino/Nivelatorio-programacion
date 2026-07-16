

import java.util.Scanner;        //if(x==0 ||(x==1){
                                     //return 0;
public class HolaMundo{

	public static int fibo(int x){
		if(x==0){
			return 0;
		}
		if(x==1){
			return 1;
		}

		return fibo(x-1)+fibo(x-2);
	}

	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		System.out.println("serie de fibo"); 
		int valor = entrada.nextInt();
		System.out.println(fibo(valor));
	}
}
