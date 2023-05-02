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




}
//
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
