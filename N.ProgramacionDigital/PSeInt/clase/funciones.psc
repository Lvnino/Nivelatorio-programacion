funcion resultado <- resta
	resultado = 4-3
FinFuncion

funcion saludar
	Escribir "hola, buenos dias"
FinFuncion

funcion saludar2 (mensaje)
	Escribir "el resultado es:",mensaje
FinFuncion

Funcion  sumarDosDigitos (a,b,c) 
	saludar2(a+b+c)
FinFuncion

funcion resultado2 <- resta2(a,b)
	resultado2 = a-b
FinFuncion

algoritmo miSegundoPrograma
	Definir x Como Entero
	saludar
	sumarDosDigitos(5,4,5)
	Imprimir resta
	x=resta2(5,1)
	Imprimir x
	Imprimir resultado3
	
FinAlgoritmo
