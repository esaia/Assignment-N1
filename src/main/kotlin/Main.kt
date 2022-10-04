

fun main() {
    var user= User.createusers(4)

    println(user)

    user.forEach { it.test("hello") }


}


class User(var name:String, var lastname:String){

    companion object {

        var users = mutableListOf<User>()

        fun createusers(count: Int):List<User> {
            for (i in 1..count){
                users.add(User("name$i", "lastname$i"))
            }
            return users
        }

        fun createuser(name: String, lastname: String):User{
            return User(name, lastname)
        }
    }


    override fun toString(): String {
        return "$name - $lastname"
    }

    fun test(x:String){
        println("$name $x")
    }


}

