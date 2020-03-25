package subtask2

class MiniMaxSum {

    val input = intArrayOf(1, 2, 3, 4, 5)


    fun getResult(input: IntArray): IntArray {
        var sumArray = emptyArray<Int>()
        var sum: Int = 0
        var tempSum: Int = 0
        var minSum: Int
        var maxSum: Int
        sum = input.sum()
        for (item in input){
            tempSum = sum
            tempSum -= item
            sumArray += tempSum
        }
        minSum = sumArray.min()!!
        maxSum = sumArray.max()!!

        var result =  arrayOf(minSum, maxSum)

        result.forEach { i -> println("Значение элемента равно $i") }

return result.toIntArray()

    }
}
