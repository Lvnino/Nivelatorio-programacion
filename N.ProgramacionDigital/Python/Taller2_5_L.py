def MCM(a, b):
    numeroA = a
    numeroB = b

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

    resultadoMCM = (numeroA * numeroB) // b
    return resultadoMCM


acumuladoMCM = 0
calculoMCM = 0
numeroNuevo = 0

primerNumero = True
entradaCiclo = True
hayNumeros = False

while entradaCiclo == True:
    print("Ingresa un número: ")
    numeroNuevo = int(input())

    if numeroNuevo > 0:
        if primerNumero == True:
            acumuladoMCM = numeroNuevo
            primerNumero = False
        else:
            calculoMCM = MCM(acumuladoMCM, numeroNuevo)
            acumuladoMCM = calculoMCM

        hayNumeros = True
    else:
        entradaCiclo = False

if hayNumeros == True:
    print("El MCM de los números ingresados antes del número inválido es:", acumuladoMCM)
else:
    print("No se ingresaron números válidos")