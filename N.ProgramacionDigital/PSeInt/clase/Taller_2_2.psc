Funcion ascendente(a,b)
	ascendente(a,b)
	Escribir  "ingresa una lista de numeros"
	
	si x mod 2==0 Entonces
		Imprimir "x es par"
	sino 
		Imprimir "x es impar"
	FinSi
	
FinFuncion

Algoritmo taller_2	
	definir x Como Entero
	Escribir "ingrese un numero a evaluar"
	
	Mientras x>0 hacer
		ascendente(a,b)
		Escribir "ingrese un numero a evaluar"
		Leer x
	fin mientras
	Imprimir "el numero ingresado fue menor o igual a cero"
FinAlgoritmo
