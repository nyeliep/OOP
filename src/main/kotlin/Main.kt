fun main(args: Array<String>) {
    val person = Human("Nyeliep",21,49)
    person.eat(10)
    println(person.weight)
    println("I am eating ${person.weight}kgs of food")
    person.speak("I am eating healthy!")
    person.birthday()
    var myData = user("Daniel","Giel","gielpal@gmail.com","0113704422",2350)
    println(myData.lastName)
    println(myData.email)








}
//Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten
//(3 points)
//-
//- speak(speech: String) :Prints the string passed to it (2
//points)
//- birthday( ) :Increments the human’s age by 1 (2
//points)
//Create an instance of this human class and invoke all its functions


class Human(var name:String,var age:Int,var weight:Int,) {
    fun eat(foodWeight: Int) {
        weight = weight + foodWeight
//        println("I am eating {$foodWeight} kgs of food")

    }

    fun speak(speech: String) {
        println("I am eating healthy!")
    }
    fun birthday(){
       var birthday = age + 1
        println(birthday)

    }
}

//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes

class user( var firstName:String, var lastName:String, var email:String, var phoneNumber:String, var password:Int,)













