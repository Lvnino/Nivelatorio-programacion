
	Funcion resultado <- validacion (numeroNuevo,numeroAnterior)
		Si numeroNuevo > numeroAnterior Entonces
			resultado = Verdadero
		SiNo
			resultado = Falso
		FinSi
		
	Fin Funcion
	
	Algoritmo Ejercicio_2
		Definir cantidadImpares, numeroNuevo, numeroAnterior Como Entero
		Definir entradaCiclo, esValido, primerNumero Como Logico
		cantidadImpares = 0
		numeroNuevo = 0
		numeroAnterior = 0
		entradaCiclo = Verdadero
		primerNumero = Verdadero
		
		Mientras entradaCiclo = Verdadero Hacer
			Escribir "Ingresa un número: "
			Leer numeroNuevo
			
			Si primerNumero = Verdadero Entonces
				numeroAnterior = numeroNuevo
				Si numeroNuevo MOD 2 <> 0 Entonces
					cantidadImpares = cantidadImpares + 1
				Fin Si
				primerNumero = Falso
			SiNo
				esValido = validacion (numeroNuevo,numeroAnterior)
				Si esValido = Verdadero Entonces
					Si numeroNuevo MOD 2 <> 0 Entonces
						cantidadImpares = cantidadImpares + 1
					Fin Si
					numeroAnterior = numeroNuevo
				SiNo
					entradaCiclo = Falso 
				Fin Si
			Fin Si
		Fin Mientras
		Imprimir "La cantidad de números impares es: ", cantidadImpares
FinAlgoritmo
