package chap02.section3

fun main() {
    var str1 : String?
//    println(str1)   <- 초기화를 하지 않았기에 컴파일 단계에서 오류가 뜬다.
//    str1 = null   <- String? 으로 선언하였기에 null 선언이 가능하다
    str1 = null
    //str1이 널이 가능한 변수이기 때문에 null 처리를 해주어야 함.
    //?.으로 해서 세이프 콜 선언
    println("str1 : $str1, length : ${str1?.length}")
    //!!. null이 아닐거라 단정, 컴파일에서 오류를 무시. 널이더라도 체크하지 않음.
//    println("str1 : $str1, length : ${str1!!.length}")  <- error
    str1 = "hello"
    println("str1 : $str1, length : ${str1.length}")
    println("str1 : $str1, length : ${str1!!.length}")

    str1 = null
//    val len = if (str1 != null) str1.length else -1
    val len = str1?.length ?: -1    //엘비스 연산자
    println("str1 : $str1, length : $len")




}