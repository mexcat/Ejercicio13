package cl.gencina.ejercicio13

import java.text.NumberFormat
import java.util.Currency
import kotlin.math.ceil

fun main(){
    println("suma 5.2 + 65.2 ${suma(5.2,65.2F)}" )
    println("redondea 3.262 ${redondeo(3.262)}")
    println("a formateo moneda ${muestra(3.32115)}")
}

fun suma(valorA:Double, valorB:Float): Double = valorA + valorB

fun redondeo(valor:Double): Double = ceil(valor)

fun muestra(valor:Double): String{
    val format: NumberFormat = NumberFormat.getCurrencyInstance()
    format.maximumFractionDigits = 0
    format.currency = Currency.getInstance("CLP")
    return format.format(valor)
}