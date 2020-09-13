object ResistorColor {

    fun colorCode(color: String): Int {
        return colors().indexOf(color)
    }

    fun colors(): List<String> {
        return listOf("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white")
    }

}
