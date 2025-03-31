
// Научная книга, наследуется от интерфейса Book
class Scientific : Book {

    var areaOfResearch = "" // Дополнительное поле для научной области

    // Переопределенные свойства из интерфейса
    override var name = ""
    override var numberOfPages = 0
    override var author = ""

    // Метод для вывода информации о книге
    override fun Info() {
        println("Название книги: ${name}")
        println("Количество страниц: ${numberOfPages}")
        println("Автор книги: ${author}")
        println("Область изучения: ${areaOfResearch}")

    }

}
