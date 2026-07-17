def MCM(a, b):

    numeroA = a
    numeroB = b

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

    return (numeroA * numeroB) // b


acumuladoMCM = 0
numero = 0

primerNumero = True
entradaCiclo = True
hayNumeros = False

while entradaCiclo:

    numero = int(input("Ingrese un número: "))

    if numero > 0:

        if primerNumero:

            acumuladoMCM = numero
            primerNumero = False

        else:

            acumuladoMCM = MCM(acumuladoMCM, numero)

        hayNumeros = True

    else:

        entradaCiclo = False

if hayNumeros:

    print("El MCM de los números ingresados antes del número inválido es:", acumuladoMCM)

else:

    print("No se ingresaron números válidos")