package ru.netology

fun main() {
    val minFee = 35_00
    val amount = 5000_00

    val transferFee = (amount * 0.0075).toInt()
    val resultFee = if (transferFee > minFee) transferFee else minFee

    println("При переводе суммы ${amount / 100} руб. комиссия составит ${resultFee / 100} руб. ${resultFee % 100} коп.")
}