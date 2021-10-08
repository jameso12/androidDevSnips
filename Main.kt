// fun is the keyword used to declare a function
// functions are followed by the parenthesis and then curly brackets
fun snips(){ // ths is a dummy function
    // const variable
    val age = 5
    // changeable variable
    var myAge = 19
    var name = "Juan"
    
    // change myAge
  	myAge = 18
    // println() prints to consola and adds a new line
    println("Hello, world!")
    // print() does not add the new line
    print("See")
    print("_They are together")
    // using variables
    // to use you will have to use ${}, similar to how you would
    // using terminal
    print("Age: ${age}" + " myAge: ${myAge}") 
    // BTW, strings can be concatenated using the + opperator
}

// birthday message implementation
fun printBorder(border: String, timesToRepeat: Int){ 
    // this function will make the border for or birthday message
    repeat(timesToRepeat){ // repeats body 30 times
        print(border)
    }
    println()
}
fun printBirthdayMessage(message: String, border: String,timesToRepeat:Int){
    printBorder(border,timesToRepeat)// print top border
    println("Happy Birthday, " + message + "!") // prints birthday message
    printBorder(border,timesToRepeat)// print bottom border
}
// end of birthday message implementation

fun main() {
    val name = "Juan"
    val border = "%"
    val timesToRepeat = 23
    printBirthdayMessage(name,border,timesToRepeat)

}
