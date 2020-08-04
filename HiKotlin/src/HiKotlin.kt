//fun main() {
//    println("Hello Kotlin")
//}

/*fun main(args: Array<String>) {
    //edit configuration에서 인자를 직접 넣어준다.
    println("args[0] : ${args[0]}")
    println(args[0])
    println("args[1] : ${args[1]}")
    println(args[2])
}*/

fun main() {
    //val 불가변 var 가변 변수

    val userName : String = "valUserName"
    var userName2 : String = "varUserName"
    var count : Int = 3

//    선언시 변수 데이터 타입을 선언해줘야한다.
//    var count2
//    count2 = 2
    println("변수 이름은 카멜 표기법을 지켜준다")
    println("userName : $userName")
    println("userName2 : $userName2")
    println("count : $count")
    println("count = 5")
    count = 5
    print("count : $count")

}
