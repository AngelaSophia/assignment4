import java.util.*

fun main () {
    names("Ayugi", "Kenya", "Kolanya", "Elephant")
    numbers()
    country()
    var k=place("Nairobi","Kisumu","Homa bay")
    println(Arrays.toString(k))
}
fun country () {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    println(cities[0].capitalize ()+ ","+cities[1].capitalize() + ","+cities[2].capitalize()+","+cities[3].capitalize())
}
fun names(name:String,country:String,school:String,animal:String){
    var names= arrayOf(name,country,school,animal)
    println(Arrays.toString(names))
}
fun numbers ()  {
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var total=numbers.component2()+numbers.component5()
    println(total)
    var index=numbers.indexOf(158)
    println(index)
    var balloon=numbers.sortedArray()
    for (element in balloon){
        println(element)
    }
    }
fun place(name1:String,name2:String,name3:String):Array<String>{
    var b=arrayOf(name1,name2,name3)
    return b



}




