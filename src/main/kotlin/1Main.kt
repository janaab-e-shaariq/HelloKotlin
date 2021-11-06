//top-level, read-only variables
val classNameVal: String = "Sharjeel Ahmad"

//top-level, mutable variables
var greeting: String = "Hi!"

fun main() {
    //mutable variables
    var name: String = "Sharjeel"
    name = "Sharjeel Ahmad"
    //local, read-only variables
    val nameVal: String = "Sharjeel"
    
    println(name)
    println(nameVal)
    println(classNameVal)
    println(greeting)
    greeting = "Hello!"
    println(greeting)
    
    /*
    All the variables in Kotlin are non-nullable by default.
    To declare nullable variables, you need to add a question mark.
    For example:
     */
    var nullableName: String? = null
    println(nullableName)
    nullableName = "Hello Nullable"
    println(nullableName)
    
    //We can also omit the type declaration 
    var typeOmittedVar = "Hi!!!"
    println(typeOmittedVar)
    
    /*
    But if you want to assign null to type-omitted variable, 
    it'll result in error, because by default variables are non-nullable.
    So, you have to first declare them to be nullable variables.
     */
    nullableName = null
    if (nullableName != null) {
        println("NullableName is not null")
    } else {
        println("NullableName is null")
    }
    
    /*
    As we are deciding on the basis of the value of a variable,
    we can also use switch statements. Which in Kolin are called 'when'
    For example:
     */
    
    nullableName = "Some Non-null String"
    
    when (nullableName) {
        null -> println("NullableName is null")
        else -> {
            println("NullableName is not null")
            println(nullableName)
        }
    }
    
    /*
    You can't assign nullable to a non-nullable variable,
    in this case we use, 'if' or 'when' things.
    For example:
     */
    
    nullableName = "hi"
    
//    var greetingToPrint: String = if (nullableName != null) nullableName else "Hi"
    var greetingToPrint: String = when(nullableName) { null -> "Hi" else -> nullableName}
    println(greetingToPrint)
}