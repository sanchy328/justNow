package ru.netology

fun main() {
    println(exitTime(400))
}

fun exitTime(second: Int, min: Int = second / 60, hours: Int = min / 60, day: Double = hours.toDouble() / 24): String = when {
    second in 0..60 -> "был(а) только что"
    second >= 61 && second <= 60 * 60 -> "был(а) в сети $min ${printMin(second)} назад"
    second >= 60 * 60 + 1 && second <= 24 * 60 * 60 -> "был(а) в сети $hours ${printHours(min)} назад"
    day >= 1 && day < 2 -> "был(а) в сети вчера"
    day >= 2 && day < 3 -> "был(а) в сети позавчера"
    else -> "был(а) давно"
}

fun printMin(second: Int, min: Int = second / 60): String = when {
    min == 1 || min%10 == 1 && min%100 != 1 -> "минуту"
    min%10 in 2..4 -> "минуты"
    else -> "минут"
}

fun printHours(min: Int, hours: Int = min / 60): String = when {
    hours == 1 || hours%10 == 1 && hours%100 != 1 -> "час"
    hours%10 in 2..4 -> "часа"
    else -> "часов"
}



