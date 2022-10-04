import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {

//    N1
    val array = mutableListOf<Int>(2,4,6,9,11,13)
    fun sashualo(array:MutableList<Int>):Int{
        var count:Int = 0
        var sum:Int = 0
        array.forEach { if(it % 2 == 0) {
            count++
            sum += it
        }
        }
        return sum/count
    }
    println(sashualo(array))

//    N2

    val mytext = "We panic in a pew!!!,."
    fun polindrome(text:String):Boolean{
        val x = text.filter { !it.isWhitespace() }.lowercase().replace(Regex("""[$,.!]"""), "").split("")
        val y = x.asReversed()
        println(x.joinToString(""))
        println(y.joinToString(""))
        if(x == y){
            return true
        }
        return false
    }
    println(polindrome(mytext))



//    N3
    val current = LocalDateTime.now()
    val x = current.formatedExtentionFunction("yyyy-MM-dd HH:mm:ss")
    println(x)
}


//N3
fun LocalDateTime.formatedExtentionFunction(pattern:String):String{

    val current = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern(pattern)
    val formatted = current.format(formatter)
    return "My formatted time is: $formatted"

}







