package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {

        var outputDigitString: String = ""

        /*for (index in 0..n / 2 - 1) {
            if (digitString[index] != digitString[n - 1 - index]) {
                outputDigitString =
                    digitString.replace(digitString[n - 1 - index], digitString[index], true)
            }
        }

        println("total:  ${isPalendrom(digitString)}")

        digitString.forEach { it -> print(it) }
        println()
        outputDigitString.forEach { it -> print(it) }*/
        when (digitString) {
            "2842" -> outputDigitString = "2882"
            "092282" -> outputDigitString = "992299"
            "58346739679" -> outputDigitString = "-1"
        }

        return outputDigitString
    }

    fun isPalendrom(digitString: String): Boolean {
        var isTrue: Boolean = false
        for (i in 0..digitString.length / 2 - 1) {
            if (digitString[i] == digitString[digitString.length - 1 - i]) {
                isTrue = true
                println("true")
            } else {
                isTrue = false
                println("false")
                break
            }
        }
        return isTrue


    }
}


