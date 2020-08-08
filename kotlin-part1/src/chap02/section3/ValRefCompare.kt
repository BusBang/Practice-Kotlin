package chap02.section3

fun main() {
    val a: Int = 128
    val b = a   // ctrl + shift + P 타입 조회

    println("a==b : ${a == b}")
    println("a===b : ${a === b}")

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c

    println("c==d : ${c == d}")
    println("c===d : ${c === d}")
    println("c===e : ${c === e}")

    //코틀린의 자료형은 모두 참조형으로 선언 --> 컴파일 후 최적화 될 때 기본형 자료형으로 변환
    //그렇기 때문에 자료형이 다른 변수에 재 할당하면 자료형 불일치 오류가 발생함

    //코틀린에서는 참조형으로 선언한 변수의 값이 -128~127 범위에 있으면 캐시에 그 값을 저장함!

}
