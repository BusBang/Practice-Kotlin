package chap02.section3

fun main() {
    //Smart Cast
    var test : Number = 12.2    //12.2에 의해 test는 Float 형으로 스마트 캐스트
    println("$test")

    test = 12   //Int형으로 스마트 캐스트
    println("$test")

    test = 120L //Long형으로 스마트 캐스트
    println(test)

    test += 12.0f   //Float 형으로 스마트 캐스트
    println(test)

    //Is
    val num = 256

    if(num is Int) {
        println(num)
    }else if (num !is Int) {
        println("Not a Int")
    }

    //Any
    //Any는 모든 클래스의 뿌리.

    var a : Any = 1 //Any형 a는 초기화될 때 Int형이 됨
    println("a : $a type : ${a.javaClass}")
    a = 20L // Int형이였던 a는 변경된 값 20L에 의해 Long
    println("a : $a type : ${a.javaClass}")
    a = "Hello"
    println("a : $a type : ${a.javaClass}")




}