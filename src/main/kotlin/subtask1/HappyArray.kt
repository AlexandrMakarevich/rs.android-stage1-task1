package subtask1

class HappyArray {

    var isEnd: Boolean = false
    lateinit var sadArray: IntArray


    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyArray = emptyArray<Int>()

        happyArray = deleteBadNumber(sadArray)
        while (!isEnd) {
            happyArray = deleteBadNumber(happyArray.toIntArray())
        }

        happyArray.forEach { i -> println("Значение элемента равно $i") }
        print(happyArray.size)
        return happyArray.toIntArray()
    }

    fun deleteBadNumber(sadArray: IntArray): Array<Int> {
        var happyArray = emptyArray<Int>()
        this.isEnd = true
        for (i in 1 .. sadArray.size - 1) {
            if (i == 1) {
                happyArray += sadArray[0]
            }
            if (i == sadArray.size-1) {
                happyArray += sadArray[sadArray.size-1]
            } else {
                if (sadArray[i] < sadArray[i - 1] + sadArray[i + 1]) {

                    happyArray += sadArray[i]

                } else {
                    this.isEnd = false
                    happyArray += sadArray[i + 1]
                    var q = i + 2
                    for (i in q until sadArray.size) {
                        happyArray += sadArray[i]
                    }
                    break
                }
            }
        }
        return happyArray
    }
}
