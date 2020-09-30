package subtask4

class StringParser {

    private fun findCloseBracket(char: Char) = when (char) {
        '(' -> ')'
        '[' -> ']'
        else -> '>'
    }
    fun getResult(inputString: String): Array<String> {
        val list = mutableListOf<String>()
        var clsBr: Char
        var count = 0

        inputString.forEachIndexed { index, char ->
            if (char == '<' || char == '[' || char == '(') {
                clsBr = findCloseBracket(char)
                loop@ for (i in (index + 1)..inputString.length) {
                    when (inputString[i]) {
                        char -> count++
                        clsBr -> {
                            if (count == 0) {
                                list.add(inputString.substring(index + 1, i))
                                break@loop
                            } else count--
                        }
                    }
                }
            }

        }

    return list.toTypedArray()
    }
}
