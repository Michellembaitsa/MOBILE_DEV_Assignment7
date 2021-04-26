fun main(){
odd()

    println(name(arrayOf("Kibet","Phyllis","Gathoni","Awinja")))
    robot(5)
    robot(12)
    robot(33)
    numbers()


}
fun odd() {
    for (i in 1..100)
        if (i % 2 == 1) {
            println(i)
        }
}

fun name(names: Array<String>): Int {
        var total= 0
        for (character in names) {
            if (character.length > 5) {
                total++
            }
        }
        return total
    }

fun robot(age:Int){
    if (age <6){
        println("Here is a glass of milk for you.")
    } else if (age>6 && age <15){
        println("Here is a bottle of fanta orange for you.")
    }else{
        println("Here is a bottle of cocacola for you.")
    }

}

fun numbers(){
    for(num in 1..100)
        if (num%3==0 && num%3==0){
            println("FizzBuzz")
        }else if (num%5==0){
            println("Buzz")
        }else if (num%3==0){
            println("Fizz")
        }else if (num%3!=0 &&num%5!=0){
            println(num)
        }
}