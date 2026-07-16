def MCD(a, b):
    # Máximo Común Divisor

    if a < b:
        auxiliar = a
        a = b
        b = auxiliar

    residuo = a % b

    while residuo > 0:
        auxiliar = b
        b = residuo
        a = auxiliar
        residuo = a % b

    return b


def main():
    acumuladoMCD = 0
    calculoMCD = 0
    numeroNuevo = 0

    primerNumero = True
    entradaCiclo = True
    hayNumeros = False

    while entradaCiclo == True:
        print("Ingresa un número: ")
        numeroNuevo = int(input())

        if numeroNuevo > 0:

            if primerNumero == True:
                acumuladoMCD = numeroNuevo
                primerNumero = False

            else:
                calculoMCD = MCD(acumuladoMCD, numeroNuevo)
                acumuladoMCD = calculoMCD

            hayNumeros = True

        else:
            entradaCiclo = False

    if hayNumeros == True:
        print("El MCD de los números ingresados antes del número inválido es:", acumuladoMCD)
    else:
        print("No se ingresaron números válidos")


main()