package chap02.section2

fun main() {
    //부동 소수점 에러
    var num : Double = 0.1

    //..은 범위 연산. 0~999
    for(x in 0..999) {
        num += 0.1
    }
    println("num : $num")
    //지수부와 가수부의 제한이 있기 때문에 연산 결과가 이상하게 나옴
}