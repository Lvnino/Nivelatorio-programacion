numero = int(input("Ingrese un número: "))

if numero <= 1:

    print("El número", numero, "no es primo")

else:

    divisor = 1
    cantidadDivisores = 0

    while divisor <= numero:

        if numero % divisor == 0:

            cantidadDivisores = cantidadDivisores + 1

        divisor = divisor + 1

    if cantidadDivisores == 2:

        print("El número", numero, "es primo")

    else:

        print("El número", numero, "no es primo")