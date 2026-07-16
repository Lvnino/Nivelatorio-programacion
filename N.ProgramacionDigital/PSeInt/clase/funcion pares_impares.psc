Funcion pares_impares(x)
	si x mod 2==0 Entonces
		Imprimir "x es par"
	sino 
		Imprimir "x es impar"
	FinSi
FinFuncion

Algoritmo mitercerprograma
	definir x Como Entero
	Escribir "ingrese un numero a evaluar"
	leer x
	Mientras x>0 hacer
		pares_impares(x)
		Escribir "ingrese un numero a evaluar"
		Leer x
	fin mientras
	Imprimir "el numero ingresado fue menor o igual a cero"
FinAlgoritmo
