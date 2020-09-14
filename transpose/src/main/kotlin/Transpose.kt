object Transpose {

    fun transpose(input: List<String>): List<String> {

        return (0 until findLongest(input))
                .map{ col -> 
                    input.mapIndexed{ row, word ->
                        when {
                            (word.length > col) -> word[col]
                            (findLongest(input.drop(row)) > col) -> ' '
                            else -> null
                        }
                    }
                    .filterNotNull()
                    .joinToString("")
                }
    }
    
    fun findLongest(strings: List<String>) = strings.maxBy { it.length }?.length ?: 0
}
