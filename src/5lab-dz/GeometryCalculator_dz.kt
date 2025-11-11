package `5lab-dz`/*class GeometryCalculator_dz {
    fun rectangleInfo(w: Int, h: Int) {
        val perimeter = 2 * ( w + h)
        val area = w * h

        println("Прямоугольник: $w x $h:")
        println("Периметр: $perimeter")
        println("Площадь: $area")

        if (perimeter == area) {
            println("Удивительно! Периметр равен площади!")
        }
        println()
    }

    fun triangleInfo(a: Int, b: Int, c: Int) {
        val perimeter = a + b + c

        val spispif = listOf(a,b,c).sorted()
        val pif = spispif[0] * spispif[0] + spispif[1] * spispif[1] == spispif[2] * spispif[2]

        println("Треугольник со сторонами: $a, $b, $c")
        if (pif) {
            println("Это прямоугольний треугольник!")
        } else {
            println("Это не прямоугольник треугольник.")
        }
        println("Периметр: $perimeter")
        println()
    }

    fun circleInfo(radius: Int) {
        val length = 2 * Math.PI * radius
        val area = Math.PI * radius * radius

        println("Окружность с радиусом $radius:")
        println("Длина окружности: $length")
        println("Площадь круга: $area")
        println()
    }
}*/