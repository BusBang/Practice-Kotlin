package chap02.section2

fun main() {
    //문자열
    //-String으로 선언되며, String Pool 이라는 공간에 구성

    var str1 : String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    //==은 값만 비교, ===은 참조형을 비교
    println("str1 === str2 : ${str1 === str2}")
    println("str1 === str3 : ${str1 === str3}")
    //var 로 선언된 str1의 참조 주소는 가변혀으로 바뀔 수 있음 (다른 것 지정 가능)
    //다만, 일단 선언되어 생성된 메모리 공간의 Hello는 바뀌지 않음. (변경 불가능)
    //str1과 str3은 같은 곳을 참조하고 있는 것임.
    str1 = "hellx"
    println("str1 : $str1")
    println("str3 : $str3")
}