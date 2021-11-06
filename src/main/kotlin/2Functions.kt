/*
To define a function, user keyword 'fun' and then the function name
followed by parentheses, and in those parentheses go parameters
and after the parentheses we can define the return type
For example:
 */

/*
If we want to return null from this function, we would need to change the return type
by adding a question mark (?) at the end, like 'String?'
 */
fun getGreeting(): String {
    return "Hello Kotlin"
}

/*
Functions also support type inferences for example
we could write the above function as follows 
 */
fun getGreeting2(): String = "Hello Kotlin" //We can also remove the explicit return type

/*
'Unit' in Kotlin specifies that this function returns nothing useful
And by default, the function has Unit return type, so we can remove the ": Unit" section
 */
fun sayHello(): Unit {
    println(getGreeting())
}

/*
Function Parameters:

 */
fun sayHelloWithParams(itemToGreet: String){
//    val msg = "Hello " + itemToGreet
//    println(msg)
    
    /*
    Kotlin allows String Templates which allow us to substitute
    variable values into predefined string template, so we could write the above line as follows 
     */
//    val msg = "Hello $itemToGreet"
//    println(msg)
    
    //And by taking it one step ahead
    println("Hello $itemToGreet")
}
//OR
fun sayHelloWithParams2(itemToGreet: String) = println("Hello $itemToGreet")

//Let's play around
fun sayHello(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")

fun main() {
    println(getGreeting())
    sayHello()
    sayHelloWithParams("Sharjeel")
    sayHelloWithParams("Ahmad")
    sayHelloWithParams2("Shaariq")
    sayHello("Hi", "Samantha")
}