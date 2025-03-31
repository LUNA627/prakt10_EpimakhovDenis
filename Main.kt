fun main() {
    try {

        // Обычный кабель
        println("Введите: Материал, тип, количество жил, диаметр кабеля")
        val cabel = Cabel(readln(), readln(), readln()!!.toInt(), readln()!!.toDouble())

        when {
            cabel.numberOfCoresCable <= 0 -> println("Количество жил кабеля не может быть меньше или равно 0")
            cabel.diameter <= 0 -> println("Диаметр кабеля не может быть меньше или равно 0")
            else ->  {
                cabel.СalculationQ()
                cabel.Info()
            }
        }



        // Специальный кабель
        println("Введите: Материал, тип, количество жил, диаметр кабеля и наличие оплетки(true или false)")
        val cabelPetomok = ClassPetomok(readln(), readln(), readln()!!.toInt(), readln()!!.toDouble(), readln()!!.toBoolean())

        when {
            cabelPetomok.numberOfCoresCable <= 0 -> println("Количество жил кабеля не может быть меньше или равно 0")
            cabelPetomok.diameter <= 0 -> println("Диаметр кабеля не может быть меньше или равно 0")
            else ->  {
                cabelPetomok.СalculationQ()
                cabelPetomok.Info()
            }
        }



        // Научная книга
        println("Введите: область изучения, название, количество страниц, название автора книги")
        val book = Scientific()
        book.areaOfResearch = readln()
        book.name = readln()
        book.numberOfPages = readln()!!.toInt()
        book.author = readln()

        when {
            book.numberOfPages <= 0 -> println("Количество страниц в книге не должно быть меньше или равно 0")
            else -> book.Info()
        }



    }
    catch (e:Exception) {
        println("Неверный формат ввода") // Обработка ошибок ввода
    }
}