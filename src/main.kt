fun main(){
    oddNumbers()

    println(myNames(arrayOf("Verite", "Salma","Judy","Shamim","Benadate")))

    robotServesDrinks(12)
    robotServesDrinks(4)
    robotServesDrinks(18)

    multiples()
}
fun oddNumbers(){
    for (numbers in 1..100){
        if (numbers%2!==0){
            println(numbers)
        }
    }
}
fun myNames(name:Array<String>):Int{
    var sum = 0
    name.forEach { nam->
        if (nam.length >5){
            sum++
        }
    }
    return sum
}
fun robotServesDrinks(age:Int){
    if (age<6){
        println("Milk")
    }
    else if (age<15 && age>6){
        println("Fanta Orange")
    }
    else{
        println("Coca Cola")
    }
}
fun multiples(){
    for (numbers in 1..100){
        if (numbers%3==0 && numbers%5==0){
            println("FizzBuzz")
        }
        else if (numbers%3==0){
            println("Fizz")
        }
        else if (numbers%5==0){
            println("Buzz")
        }
        else{
            println(numbers)
        }
    }
}