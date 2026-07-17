def MCD(a, b):

    if a < b:
        temporal = a
        a = b
        b = temporal

    residuo = a % b

    while residuo > 0:

        temporal = b
        b = residuo
        a = temporal

        residuo = a % b

    return b


acumuladoMCD = 0
numero = 0

primerNumero = True
entradaCiclo = True
hayNumeros = False

while entradaCiclo:

    numero = int(input("Ingrese un número: "))

    if numero > 0:

        if primerNumero:

            acumuladoMCD = numero
            primerNumero = False

        else:

            acumuladoMCD = MCD(acumuladoMCD, numero)

        hayNumeros = True

    else:

        entradaCiclo = False

if hayNumeros:

    print("El MCD de los números ingresados antes del número inválido es:", acumuladoMCD)

else:

    print("No se ingresaron números válidos")