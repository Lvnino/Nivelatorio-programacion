Funcion resultadoMCM <- MCM (a,b)// minimo como un multiplo
	numeroA = a
	numeroB = b
	
	Si a < b Entonces
		auxiliar = a
		a = b
		b = auxiliar
	Fin Si
	residuo = a mod b
	
	Mientras residuo > 0 Hacer
		auxiliar = b
		b = residuo
		a = auxiliar
		residuo = a MOD b
	Fin Mientras
	resultadoMCM = (numeroA * numeroB)/b
Fin Funcion

Algoritmo Ejercicio_5
	
	Definir acumuladoMCM, calculoMCM, numeroNuevo Como Entero
	Definir primerNumero,entradaCiclo, hayNumeros Como Logico
	acumuladoMCM = 0
	primerNumero = Verdadero
	entradaCiclo = Verdadero
	hayNumeros = Falso
	
	Mientras entradaCiclo = Verdadero Hacer
		Escribir "Ingresa un número: "
		Leer numeroNuevo
		
		Si numeroNuevo > 0 Entonces
			Si primerNumero = Verdadero Entonces
				acumuladoMCM = numeroNuevo
				primerNumero = Falso
			SiNo
				calculoMCM= MCM(acumuladoMCM,numeroNuevo)
				acumuladoMCM = calculoMCM
			Fin Si
			hayNumeros = Verdadero
		SiNo
			entradaCiclo = Falso 
		Fin Si
	Fin Mientras
	
	Si hayNumeros = verdadero Entonces
		Imprimir "EL MCM de los numeros ingresados antes del numero invalido es: ",acumuladoMCM
	SiNo
		Imprimir "no se ingresaron números válidos"
	Fin Si
	
FinAlgoritmo

