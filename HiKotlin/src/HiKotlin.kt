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

//자료형 사용

//자료형 생략
//val num05 = 127  -> Int형으로 추론
//val num06 = -23127  -> Int형으로 추론
//val num07 = 2324127  -> Int형으로 추론
//val num08 = 127123123123123123  -> Long형으로 추론

//접미사 접두사 사용
// val exp01 = 123 -> Int형으로 추론
// val exp02 = 123L -> 접미사 L을 사용해 Long형으로 추론
// val exp03 = 0x0F -> 접두사 0x를 사용해 16진 표기가 사용된 Int형으로 추론
// val exp04 = 0b00001011 -> 접두사 0b를 사용해 2진 표기가 사용된 Int형으로 추론

//작은 값의 사용
// val exp08 : Byte = 127   // 명시적으로 자료형을 지정(Byte)
// val exp09 : Short = 127   // 명시적으로 자료형을 지정(Short)


