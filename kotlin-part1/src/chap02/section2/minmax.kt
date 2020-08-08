package chap02.section2

fun main() {
    //각 자료형의 범위 표현
    println("Int : ${Int.MIN_VALUE}~${Int.MAX_VALUE}")
    println("Byte : ${Byte.MIN_VALUE}~${Byte.MAX_VALUE}")
    println("Short : ${Short.MIN_VALUE}~${Short.MAX_VALUE}")
    println("Long : ${Long.MIN_VALUE}~${Long.MAX_VALUE}")
    println("Float : ${Float.MIN_VALUE}~${Float.MAX_VALUE}")
    println("Double : ${Double.MIN_VALUE}~${Double.MAX_VALUE}")

    //2의 보수
    //자료형의 크기 때문에 가산회로만으로 뺄셈을 표현할 수 있기 때문에
    //6의 이진 값 : 0000 0110(2)
    //0과 1을 뒤집어 주고 +1을 해준 것과 같다.
    //-6의 이진 값 : -1111 1010(2)

    //논리 자료형
    val isOpen = true
    val isUploaded : Boolean

    //문자 자료형
    val ch = 'c' // ch는 char로 추론.
    val ch2 : Char //선언만 한 경우, 자료형 (Char)를 반드시 명시.




}