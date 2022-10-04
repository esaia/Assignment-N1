fun main() {
    val car1 = Car("Ford", 3.4f, "white")
//    val car2 = Car("BMW", 2.4f)
    println(car1)

    val point1 = Point(2f,22f)
    val point2 = Point(1f,12f)
    var testttt = point1.plus(point2)

    println(testttt)
//    val point = point1.apply {
//        this.mirroring()
//    }
     val test21 = Point(23f,66f).apply {
         this.mirroring()
     }

    println(test21)



    val list = mutableListOf(1,2,3)
    val list2 = mutableListOf("a", "b", "c")

    fun <t>MutableList<t>.swap(index1:Int, index2:Int){
        val x = this[index1]
        this[index1] = this[index2]
        this[index2] = x
        println(this)
    }

    println(list)
    list.swap(0,1)
//    val testtt = list.apply {
//        this.swap(1,2)
//    }
//    println(testtt)

}

object Mysingleton{
    const val X = 1
}



open class Car (private  val name: String, private val engine: Float = 0.0f, private val color: String = "green") {
    init{
        println("primary constractor: $name $color")
    }
    //secondary constractor
    constructor(name: String, engine: Float): this(name, engine, "green"){
        println("Secondary constructor: $name $color  ")
    }

    override fun toString(): String {
        return " $name, $engine $color"
    }


}




data class Point(var x: Float, var y: Float)

operator fun Point.plus(point: Point):String{
    return "${this.x + point.x}  - ${this.y + point.y}"
}

fun Point.mirroring(){
    this.x *= -1
    this.y *= -1

}