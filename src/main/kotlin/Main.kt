fun main() {
    usersDetail("Yekebedi", 22, "Kenya")
    println(sum(100,49,540,30))
    println(averageNumbers(80,40,34,50,20))
    var person= Person("Agness", 40,"0726890865","Agness@gmail", 78.5, true)
    println( person.age)
    println(person.fullName)
    println(person.phoneNumber)
    println( person.email)
    println(person.weight)
    println(person.citizen)
    var drum = africanDrum ("leather", "large")
    drum.drumSound(" a clap")
    var drum1 = africanDrum.Djembe("golden","medium")
    drum1.drumSound(" a wide range of tone")
    var drum2 = africanDrum.talkingDrum("leather", "large")
    drum2.drumSound(" mimic lines of human lines")
    var drum3 = africanDrum.Bougarabou("golden","medium")
    drum3.drumSound("a deep, rich bass tone")






}
//1. Create and invoke a function that takes in a users name, age,
//and nationality and prints out “Hello my name is ${name},
//I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out
//“Hello my name is Lucy, I am 23 years old and I am from Kenya” (2 points)

fun usersDetail(name: String, age:Int, nationality: String){
    println("Hi, my name is $name,i am $age years old, and i am from $nationality")

}

//2. Create and invoke a function that returns the sum of any given 4 numbers (3 points)
fun sum(num:Int,num1:Int,num2:Int,num3:Int): Int{
    var addition = num1 + num1+ num2+ num3
    return addition
}

//3. Create and invoke a function that given any 5 numbers, it returns their average (2 points)

fun averageNumbers(number: Int, number1: Int,number2: Int, number3: Int,number4: Int): Int{
     var average  = (number + number1 + number2 + number3 + number4)/5
    return average


}
//4. You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)

class Person (val fullName: String, val age: Int, val phoneNumber:String, var email: String, val weight:Double, var citizen:Boolean){

}
fun personDetails(){

}
//                             Classes  Assessment
//# The Legendary African Drum Circles: You're part of a community that holds
//# one of the largest drum circles in Africa. There are different types of traditional drums used
//# in the circle, each with its unique sound and rhythm . The Djembe, Talking Drum, and
//# Bougarabou are among the popular ones.These drums have common properties such as the material
//# they're made from and their sizes, but they have distinct characteristics. For instance, the talking
//# Drum can mimic lines of human speech, the Djembe is known for its wide range of tones , and the
//# Bougarabou is noted for its deep, rich bass tones.

//# You want to create a software model of the drum circle that encapsulates these different types
//# of drums.You wish to include methods for each drum that represent the sound it makes, and also group
//# similar drums together. Think about creating a base Drum class tht contains properties and the
//#  methods common to all drums and then create subclasses for each specific type of drum (like Djembe,
//#  Talking Drum , and  Bougarabou.

//# The subclasses should inherit from the base Drum class and also implement their unique characteristics.
//# This software model would help newcomers understand the characteristics of each drum and how they
//# contribute to the overall rhythm of the drum circle.

open class africanDrum (var material:String, var size:String ){
    open fun drumSound(tone:String){
        println("produces $tone sound")
    }
    class Djembe(material: String, size: String): africanDrum (material, size){
        override fun drumSound(tone:String){
            println("produces $tone sound")
        }
    }
    class talkingDrum(material: String, size: String): africanDrum (material, size) {
        override fun drumSound(tone: String) {
            println("produces $tone sound")
        }
    }
    class  Bougarabou(material: String, size: String): africanDrum (material, size) {
        override fun drumSound(tone: String) {
            println("produces $tone sound")
        }
    }
}
