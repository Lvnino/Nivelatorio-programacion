Algoritmo Ejercicio2
	Definir x,max,min,suma,conteo Como Entero
	Imprimir "ingrese numeros"
	Leer x
	conteo=0
	suma=0
	si x>0 Entonces
		max=x;
		menos=x;
	FinSi
	Mientras x>0 Hacer //cuando se ingresa un valor menor a cero fin de la ejecucion//
		si x>max Entonces
			max=x
		FinSi
		si x<min Entonces
			min=x
		FinSi
		conteo=conteo+1
		suma=suma+x
		leer x
	FinMientras
	Escribir "el mayor numero ingresado:",max," y el menor numero ingresado:",min," y el promedio: ",suma/conteo
	
FinAlgoritmo
