fun sayHello(greeting: String, itemsToGreet: List<String>) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

/*
After the initial greeting, we can send 0 or more String while calling the function
Separating each string by comma
And if we want to send an arrayOf() variable to this function then we use aesteric 
e.g sayHello("Hi", *interestingThings)
 */
fun sayHello(greeting: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

/*
Default value of greeting will be used, if it is not passed.
 */
fun greetPerson(greeting: String = "Hello", name: String) = println("$greeting $name")

fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    //To traverse the whole collection
    for (interestingThing in interestingThings) {
        println(interestingThing)
    }
    println()

    //A more functional approach to collection iteration, called Lambda Syntax
    interestingThings.forEach {
        println(it)
    }
    println()

    //We can also replace 'it' with something more readable like
    interestingThings.forEach { interestingThing ->
        println(interestingThing)
    }
    println()

    //But in the above method we have lost the index of the item, so for that
    interestingThings.forEachIndexed { index, interestingThing ->
        println("$interestingThings is at $index index")
    }
    println()

    /*
    arrayOf() defines an array of a specific type
    we can make lists using listOf() method
    and all the above methods apply to lists as well
     */
    val interestingThings1 = listOf("Kotlin", "Programming", 1)

    interestingThings1.forEach { interestingThing ->
        println(interestingThing)
    }
    println()

    /*
    let's look at another collection type, which is Map
    it takes key value pairs, the key value pairs are defined as follows
    KEY to VALUE
     */
    val map = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    map.forEach { key, value ->
        println("$key -> $value")
    }
    println()

    /*
    By default, the arrays, lists and maps are immutable
    i.e. you can't add, delete or change something
    to make them mutable, you replace arrayOf, listOf and mapOf with 
    mutableArrayOf, mutableListOf and mutableMapOf, respectively
     */
    val mutableMap = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    mutableMap.forEach { key, value ->
        println("$key -> $value")
    }
    println()
    mutableMap.put(1, "d") //if you use a new key, it'll add, if you use and old key it'll update
    mutableMap.forEach { key, value ->
        println("$key -> $value")
    }

    /*
    Named-Parameters allow us to define parameters without mixing them.
     */
    greetPerson(name = "Sharjeel", greeting = "Hello") // while in function declaration, name comes after greeting
    greetPerson(name = "Sharjeel") // default value of the argument greeting is used from function signature
    
}