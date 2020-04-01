package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {

        var outputDigitString: StringBuilder = java.lang.StringBuilder()
        var maxItem: Char = digitString.max()!!
        var i = 0
        var iHalf: Int = 0

        for (index in 0 until n) {

            if (iHalf <= k) {
                var left = digitString[index]
                var right = digitString[n - 1 - index]
                when {
                    left > right -> {
                        outputDigitString.append(left)
                        i++
                        iHalf = i / 2
                    }
                    left < right -> {
                        outputDigitString.append(right)
                        i++
                        iHalf = i / 2
                    }
                    left == right -> outputDigitString.append(left)
                }
            } else return "-1"
        }

        if (iHalf < k) {
            for (index in 0 .. outputDigitString.length){
                if (iHalf < k){
                    outputDigitString[index] = maxItem
                    outputDigitString[n - 1 - index] = maxItem

                    iHalf ++
                }
            }

        }



        println("total:  ${isPalendrom(digitString)}  i == $i ")

        digitString.forEach { it -> print(it) }
        println()
        outputDigitString.forEach { it -> print(it) }
        println()

        println(maxItem)
        println("total:  ${isPalendrom(outputDigitString.toString())}")

        return outputDigitString.toString()
    }

    fun isPalendrom(digitString: String): Boolean {
        var isTrue: Boolean = false
        for (i in 0..digitString.length / 2 - 1) {
            if (digitString[i] == digitString[digitString.length - 1 - i]) {
                isTrue = true
            } else {
                isTrue = false
                break
            }
        }
        return isTrue
    }


}


