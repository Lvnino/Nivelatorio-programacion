Algoritmo Ejercicio_3
		Definir numeroNuevo, iterador, contador Como Entero
		
		Escribir "Ingresa un numero: "
		Leer numeroNuevo
		
		Si numeroNuevo <= 1 Entonces
			Escribir "El numero ", numeroNuevo, " no es primo"
		SiNo
			iterador = 1
			sumaResiduoCero = 0
			
			Mientras iterador <= numeroNuevo Hacer
				Si numeroNuevo MOD iterador == 0 Entonces
					sumaResiduoCero = sumaResiduoCero + 1
				Fin Si
				iterador = iterador + 1
			Fin Mientras
			
			Si sumaResiduoCero == 2 Entonces
				Escribir "El numero ", numeroNuevo, " es primo"
			SiNo
				Escribir "El numero ", numeroNuevo, " no es primo"
			Fin Si
			
		Fin Si
		
		
		
FinAlgoritmo
