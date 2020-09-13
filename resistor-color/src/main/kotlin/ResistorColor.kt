object ResistorColor {
    fun colorCode(color: String) = colors().indexOf(color)

    fun colors() = listOf("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white")
}
