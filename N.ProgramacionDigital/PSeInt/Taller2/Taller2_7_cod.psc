Funcion resultadoFactorial <- calculoFactorial (numeroNuevo)
	resultadoFactorial = 1
	iterador = 1
	Si numeroNuevo == 1 O numeroNuevo == 0 Entonces
		resultadoFactorial = 1
	SiNo
		Mientras iterador <= numeroNuevo Hacer
			resultadoFactorial = resultadoFactorial * iterador
			iterador = iterador + 1
		Fin Mientras
	Fin Si
fin funcion

Algoritmo Ejercico_7
	
	Definir factorial, n, r ,permutacion, combinacion, numeroNuevo1, resta, numeroNuevo2 Como Entero
	Definir isPrimerNumero , isSegundoNumero,isValidoNumeros Como Logico
	isPrimerNumero = Verdadero	
	isSegundoNumero = Verdadero
	noEsValidoNumeros = Verdadero 
	
	Mientras noEsValidoNumeros = Verdadero Hacer
		Mientras isPrimerNumero = Verdadero Hacer
			Escribir "Ingresa el primer número: "
			Leer numeroNuevo1
			Si  numeroNuevo1 < 0 Entonces
				Escribir "Número inválido. Intente nuevamente"
			SiNo
				isPrimerNumero = falso 
			Fin Si
		Fin Mientras
		
		Mientras isSegundoNumero = Verdadero Hacer
			Escribir "Ingresa el segundo número: "
			Leer numeroNuevo2
			Si  numeroNuevo2 < 0 Entonces
				Escribir "Número inválido. Intente nuevamente"
			SiNo
				isSegundoNumero = falso 
			Fin Si
		Fin Mientras
		
		Si numeroNuevo1 >= numeroNuevo2 Entonces
			noEsValidoNumeros = Falso
		SiNo
			isPrimerNumero = Verdadero
			isSegundoNumero =  Verdadero
			Escribir "El primer número debe ser mayor o igual que el segundo."
		Fin Si
	Fin Mientras
	
	n = numeroNuevo1 //El primer número es n (el total de elementos).
	r = numeroNuevo2 //El segundo número es r (los elementos que quieres escoger).
	resta = numeroNuevo1 - numeroNuevo2 //(n-r)
	
	permutacion = calculoFactorial(n)/ calculoFactorial(resta) //Formula P(n,r) = n!/(n-r)!
	
	combinacion = calculoFactorial(n)/(calculoFactorial(r) * calculoFactorial(resta)) //Formula P(n,r) = n!/r! (n-r)!
	
	Escribir "P(", numeroNuevo1, ",", numeroNuevo2, ") = ", permutacion
	Escribir "C(", numeroNuevo1, ",", numeroNuevo2, ") = ", combinacion
	
FinAlgoritmo 
