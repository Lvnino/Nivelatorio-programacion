def validacion(numeroNuevo, numeroAnterior):
    if numeroNuevo > numeroAnterior:
        resultado = True
    else:
        resultado = False
    return resultado


def main():
    cantidadImpares = 0
    numeroNuevo = 0
    numeroAnterior = 0
    entradaCiclo = True
    primerNumero = True

    while entradaCiclo == True:
        print("Ingresa un número: ")
        numeroNuevo = int(input())

        if primerNumero == True:
            numeroAnterior = numeroNuevo

            if numeroNuevo % 2 != 0:
                cantidadImpares = cantidadImpares + 1

            primerNumero = False

        else:
            esValido = validacion(numeroNuevo, numeroAnterior)

            if esValido == True:
                if numeroNuevo % 2 != 0:
                    cantidadImpares = cantidadImpares + 1

                numeroAnterior = numeroNuevo

            else:
                entradaCiclo = False

    print("La cantidad de números impares es:", cantidadImpares)


main()