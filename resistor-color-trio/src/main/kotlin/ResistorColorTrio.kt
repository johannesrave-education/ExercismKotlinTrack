object ResistorColorTrio {

    fun text(vararg input: Color): String {
        val digit1 = input[0].ordinal
        val digit2 = input[1].ordinal
        var zeroes = input[2].ordinal%3
        var unit = input[2].ordinal/3
        
        if (digit2 == 0){
            zeroes = (zeroes + 1) % 3
            unit += 1
            return "" + digit1 + "0".repeat(zeroes) + " " + Unit.values()[unit].toString().toLowerCase()
        }
        
        return "" + digit1 + digit2 + "0".repeat(zeroes) + " " + Unit.values()[unit].toString().toLowerCase()
    }
}
