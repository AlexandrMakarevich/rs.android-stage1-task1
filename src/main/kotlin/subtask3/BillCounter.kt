package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sum = 0
        var output: String = ""

        sum = (bill.sum() - bill[k]) / 2


        if (sum == b) {output = "bon appetit"}
        else {
                output = "${b - sum}"
        }
        return output

    }
}
