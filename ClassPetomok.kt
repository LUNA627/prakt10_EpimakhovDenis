
// Класс специального кабеля, наследуется от Cabel
class ClassPetomok(material: String, type: String, numberOfCoresCable: Int, diameter:Double, val P: Boolean): Cabel(material, type, numberOfCoresCable, diameter) {


    // Переопределенный метод расчета качества с учетом оплетки
     override fun СalculationQ() {
         val Q = diameter / numberOfCoresCable
         var Qp: Double
         when {
             P == true ->  Qp = 2 * Q
             else -> Qp = 0.7 * Q
         }
         println("Качество кабеля Qp: ${Qp}")
    }

    // Переопределенный метод вывода информации
    override fun Info() {
        println("Тип кабеля: ${material}")
        println("Материал кабеля: ${type}")
        println("Количество жил у кабеля: ${numberOfCoresCable}")
        println("Диаметр кабеля: ${diameter}")
        println("Наличие оплетки: ${P}")
    }


}