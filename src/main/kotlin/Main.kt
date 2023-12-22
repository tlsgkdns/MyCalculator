fun main() {
    var calculator = Calculator()
    while(true)
    {
        println("숫자 2개를 입력하시오")
        try {
            var num1 = readln().toInt()
            var num2 = readln().toInt()
            println("연산 결과는....: " + calculator?.calculate(num1, num2))
            break
        } catch (e : java.lang.NumberFormatException)
        {
            println("다시 입력해주세요")
        } catch (e : java.lang.ArithmeticException)
        {
            println("숫자가 잘못되었습니다.")
        }
    }


}


