fun main(args: Array<String>)
{
    println("Выберете фигуру 1) Прямоугольник 2) Треугольник 3) Круг")
    val a = readln().toString().toDouble()
    if (a > 0 && a < 2)
    {
        println("Введите стороны a и b")
        print("a: ")
        val p1 = readln().toString().toDouble()
        print("b: ")
        val p2 = readln().toString().toDouble()
        val s1 = p1 * p2
        println("Площадь прямоугольника: " + s1)
    }
    else if (a > 1 && a <3)
    {
        println("Введите стороны: основание a и высоту h")
        print("a: ")
        val t1 = readln().toString().toDouble()
        print("h: ")
        val t2 = readln().toString().toDouble()
        val s2 = (t1 * t2) / 2
        println("Площадь треугольника: " + s2)
    }
    else if (a > 2 && a < 4)
    {
        println("Введите радиус окружности")
        print("r: ")
        val k1 = readln().toString().toDouble()
        val s3 = k1 * k1 * 3.14
        println("Площадь круга: " + s3)
    }
    else
    {
        println("Нет такого варианта")
    }
}