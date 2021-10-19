import sun.jvm.hotspot.oops.CellTypeState.value

fun main() {
// first thing first we will make everything very simple and basic
    // here we created a map and pointed every elemrnt to a string
    // we can point to any data type and use any value (but we will keep it simple so we make in order)
    var map_names = mutableMapOf("Mubarak" to 1,"Nasser" to 2,"Omar" to 3,"Ahmed" to 4)
    println(map_names)
    //to add a new element to a map we can use function ( put ) to add the element to a map
    // there is another method by writing the name of elemnt (key) and assignt it
    map_names.put("Khalid",5)
    //map_names["Khalid"] = 5
    println(map_names)
    // to remove an elemrnt (key) we just use keyword remove
    map_names.remove("Nasser")
    println(map_names)
    //there somthing we need to note
    // the key can NOT be changed
    // so we only can change th value that key assignt to it like next example
map_names.put("Mubarak",4)
    println(map_names)

    //====================================================
val City= mutableMapOf("Riyadh" to "Center", "Abha" to "South", "Jeddah" to "East")
    val some_names = listOf("name1 7" ,"name2","name3")
    some_names.associateTo(City) {it to it}.forEach(key, value->

    println("$key : $value")
    )







}


