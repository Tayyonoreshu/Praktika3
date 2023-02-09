fun main(args: Array<String>)
{
    println("Введите значения сторон a, b ,c прямоугольной трапеции")
    print("Введите a - ")
    val a = readln().toString()
    print("Введите b - ")
    val b = readln().toString()
    print("Введите c - ")
    val c = readln().toString()
    //объём
    val v = a.toDouble() * b.toDouble() * c.toDouble()
    println ("Объем: " + v)
    //площадь поверхности
    val s = 2 * (a.toDouble() * b.toDouble() + b.toDouble() * c.toDouble() + a.toDouble() * c.toDouble())
    println ("Площадь поверхности: " + s)
}