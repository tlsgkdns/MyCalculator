class Calculator {

    private lateinit var operation : AbstractOperation
    private fun setOperation(operationNumber: Int): Boolean
    {
        when(operationNumber)
        {
            1 -> operation = AddOperation();
            2 -> operation = SubtractOperation();
            3 -> operation = MultiplyOperation();
            4 -> operation = DivideOperation();
            5 -> operation = RemainOperation();
            else ->
            {
                println("다시 입력해주세요.")
                return false
            }
        }
        return true
    }
    constructor()
    {
        while(true)
        {
            printInfo()
            var operationNumber = 0;
            try {
                operationNumber = readln().toInt()
            }catch (e : java.lang.NumberFormatException)
            {
                println("숫자를 입력해주세요");
            }
            if(setOperation(operationNumber)) break
        }
    }
    private fun printInfo()
    {
        println("1. 덧셈")
        println("2. 빼기")
        println("3. 곱셈")
        println("4. 나누기")
        println("5. 나머지")
        println("연산자 번호를 선택하세요: ")
    }
    fun calculate(num1: Int, num2: Int): Int
    {
        return operation.calculate(num1, num2)
    }
}