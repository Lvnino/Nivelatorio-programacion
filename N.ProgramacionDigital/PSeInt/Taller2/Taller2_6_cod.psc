Algoritmo Ejercicio6
	Definir numeroNuevo, factorPrimo Como Entero
	Definir numeroImprimir Como Caracter
	factorPrimo = 2
	numeroImprimir = ""
	Escribir "Ingrese un numero: "
	Leer numeroNuevo
	Imprimir "La descomposición en factores primos del numero ",numeroNuevo, " es: " Sin Saltar
	
	Mientras numeroNuevo > 1 Hacer
		Si numeroNuevo MOD factorPrimo == 0 Entonces
			numeroNuevo = numeroNuevo/factorPrimo
			si numeroNuevo == 1 Entonces
				Escribir factorPrimo
			SiNo
				Escribir factorPrimo," x " Sin Saltar
			Fin Si
		SiNo
			factorPrimo = factorPrimo + 1
		Fin Si
	FinMientras
	
	Si numeroNuevo < 1 Entonces
		Imprimir "Número inválido. Ingrese un número mayor que 1"
	Fin Si
	
FinAlgoritmo

