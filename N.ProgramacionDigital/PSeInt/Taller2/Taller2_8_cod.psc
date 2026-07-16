Funcion resultadoInteresToTal <- InteresTotal (CantidadDePrestamo,porCuantosMeses,interesMensual)
	interesMensual= interesMensual/100
	resultadoInteresToTal = CantidadDePrestamoPrestamo * porCuantosMeses * interesMensual
Fin Funcion

Algoritmo Ejercico_8 //El ejercicio usa el calculo del interés simple
	
	Definir CantidadDePrestamo, porCuantosMeses,valorTotalAPagar Como Entero
	Definir interesMensual Como Real
	
	Escribir "Ingresa el monto del préstamo (capital): "
	Leer CantidadDePrestamo
	Escribir "Ingresa el número de meses del préstamo: "
	Leer porCuantosMeses
	Escribir "Ingrese el interés mensual en porcentaje: "
	Leer interesMensual
	
	valorTotalAPagar = cantidaDePrestamo + InteresTotal(cantidadDePrestamo,porCuantosMeses,interesMensual)
	Imprimir "El valor total a pagar es: $", valorTotalAPagar
FinAlgoritmo

