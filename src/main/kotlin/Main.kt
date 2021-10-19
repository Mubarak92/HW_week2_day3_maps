
fun main() {
// first thing first we will make everything very simple and basic
    // here we created a map and pointed every element to a string
    // we can point to any data type and use any value (but we will keep it simple, so we make in order)
    var map_names = mutableMapOf("Mubarak" to 1,"Nasser" to 2,"Omar" to 3,"Ahmed" to 4)
    println(map_names)
    //to add a new element to a map we can use function ( put ) to add the element to a map
    // there is another method by writing the name of element (key) and assigns it
    map_names.put("Khalid",5)
    //map_names["Khalid"] = 5
    println(map_names)
    // to remove an element (key) we just use keyword remove
    map_names.remove("Nasser")
    println(map_names)
    //there something we need to note
    // the key can NOT be changed,
    // so we only can change th value that key assign to it like next example
map_names.put("Mubarak",4)
    println(map_names)

    //====================================================
/*val City= mutableMapOf("Riyadh" to "Center", "Abha" to "South", "Jeddah" to "East")
    val some_names = mutableListOf("name1 7" ,"name2","name3")
    some_names.associateWithTo(City) { it }.forEach(

    )

 */
    val City= mutableMapOf<String,String>("Riyadh" to "Center", "Abha" to "South", "Jeddah" to "West")
    City.putAll(listOf("Dammam","Tabuk","Jizan").mapIndexed { index,item -> index.toString() to item })

   // City.putAll(mapOf("Dammam" to "East","Tabuk" to "dd","44" to "dsfdsfdf"))
    println(City)
}



