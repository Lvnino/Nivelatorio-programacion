def validacion(numeroNuevo, numeroAnterior):

    if numeroNuevo > numeroAnterior:
        return True
    else:
        return False


cantidadImpares = 0
numeroNuevo = 0
numeroAnterior = 0

entradaCiclo = True
primerNumero = True

while entradaCiclo:

    numeroNuevo = int(input("Ingrese un número: "))

    if primerNumero:

        numeroAnterior = numeroNuevo

        if numeroNuevo % 2 != 0:
            cantidadImpares = cantidadImpares + 1

        primerNumero = False

    else:

        esValido = validacion(numeroNuevo, numeroAnterior)

        if esValido:

            if numeroNuevo % 2 != 0:

                cantidadImpares = cantidadImpares + 1

            numeroAnterior = numeroNuevo

        else:

            entradaCiclo = False

print("La cantidad de números impares es:", cantidadImpares)