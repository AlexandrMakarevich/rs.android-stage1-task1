package subtask4


class StringParser {
    var stringBuilder: StringBuilder = java.lang.StringBuilder()
    var outputStringArray = emptyArray<String>()


    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {


        for (index in inputString.indices) {

            if (inputString[index] == '(') {
                findCornerBraces(inputString, index, '(', ')')
            }

            if (inputString[index] == '[') {
                findCornerBraces(inputString, index, '[', ']')
            }

            if (inputString[index] == '<') {
                findCornerBraces(inputString, index, '<', '>')
            }
        }

        outputStringArray.forEach { item -> println(item) }

        return outputStringArray
    }

    fun findCornerBraces(inputString: String, index: Int, charIn: Char, charOut: Char) {
        var i = 0
        for (index1 in index + 1 until inputString.length) {

            if (inputString[index1] == charIn) i += 1
            if (inputString[index1] != charOut) {
                stringBuilder.append(inputString[index1])
            }
            else {
                if (i == 0) {
                    outputStringArray += stringBuilder.toString()
                    stringBuilder.delete(0, stringBuilder.length)
                    break
                } else {
                    stringBuilder.append(inputString[index1])
                    if (inputString[index1] == charOut) {i -= 1}
                }
            }
        }
    }
}

