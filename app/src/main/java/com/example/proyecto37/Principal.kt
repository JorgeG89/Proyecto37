package com.example.proyecto37

fun main(args: Array<String>) {
    //Trabajo de Jorge Mañas Garcia
    //Trabajo por terminal

    print("Cuantos empleados tiene la empresa: ")
    val nEmpleados = readLine()!!.toInt()
    var repeticion = 1
    var contadorSMenor = 0
    var contadorSMayor = 0
    var gastos = 0.0

    while (repeticion <= nEmpleados) {
        print("Ingrese el sueldo del empleado: ")
        val sueldo = readLine()!!.toDouble()

        if (sueldo <= 300)
            contadorSMenor = contadorSMenor + 1
        else
            contadorSMayor = contadorSMayor + 1

        gastos = gastos + sueldo;
        repeticion = repeticion + 1
    }
    println("Cantidad de empleados con sueldos entre 100 y 300: $contadorSMenor")
    println("Cantidad de empleados con sueldos mayor a 300: $contadorSMayor")
    System.out.print("Gastos total de la empresa en sueldos: $gastos")
}