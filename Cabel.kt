import java.lang.reflect.Type


// Базовый класс кабеля, наследуется от WireMaterial
open class Cabel(material: String): WireMaterial(material) {

    var type: String = ""
    var numberOfCoresCable: Int = 0
    var diameter: Double = 0.0

    // Вторичный конструктор
    constructor(material: String, _type: String, _numberOfCoresCable: Int, _diameter:Double): this(material) {
        type = _type // Тип кабеля
        numberOfCoresCable = _numberOfCoresCable // Количество жил
        diameter = _diameter // Диаметр кабеля
    }

    // Метод для расчета качества кабеля
    open fun СalculationQ() {
        val Q = diameter / numberOfCoresCable
        println("Качество кабеля: ${Q}")
    }


    // Переопределенный метод для вывода информации
    override fun Info() {
        println("Тип кабеля: ${material}")
        println("Материал кабеля: ${type}")
        println("Количество жил у кабеля: ${numberOfCoresCable}")
        println("Диаметр кабеля: ${diameter}")
    }




}