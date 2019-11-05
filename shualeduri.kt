import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner

// if else
fun main() {
    var a = 20
    var b = 3
    if(a>=b){
        println("pirveli ricxvi metia an tolia meoreze")}
    else {
        println("meore ricxvi metia pirvelze")
    }


    // else if
    fun main0() {
        var a = -20
        if (a > 0) {
            println("ricxvi dadebitia")
        } else if (a < 0) {
            println("ricxvi uaryofitia")
        } else {
            println("ricxvi nulis tolia")
        }
    }


    //when
    fun main1() {
        var a = 5
        when (a) {
            in 1..10 -> print("ricxvi aris 1-10-mde shualedshi")
            in 10..20 -> print("ricxvi aris 10-20 mde shualedshi")
            else -> print("ricxvi aris shualedis garet")
        }
    }



    //while
    fun main2() {
        var a = 1
        while (a < 10) {
            println("$a")
            a++
        }
    }

    // do while
    fun main3() {
        var a = 1
        do {
            print("$a ")
            a++
        } while (a <= 8)
    }
}


//for
fun main4(){
    for (a in 8 downTo 0 step 2) {
        println(a)
    }
}
//for
fun main5(){
    for (a in 2 until 10 step 2) {
        println(a)
    }
}