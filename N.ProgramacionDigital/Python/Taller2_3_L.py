numeroNuevo = 0
iterador = 0
sumaResiduoCero = 0

print("Ingresa un número: ")
numeroNuevo = int(input())

if numeroNuevo <= 1:
    print("El número", numeroNuevo, "no es primo")
else:
    iterador = 1
    sumaResiduoCero = 0

    while iterador <= numeroNuevo:
        if numeroNuevo % iterador == 0:
            sumaResiduoCero = sumaResiduoCero + 1

        iterador = iterador + 1

    if sumaResiduoCero == 2:
        print("El número", numeroNuevo, "es primo")
    else:
        print("El número", numeroNuevo, "no es primo") # solo esta ejecutandose para 1 numero