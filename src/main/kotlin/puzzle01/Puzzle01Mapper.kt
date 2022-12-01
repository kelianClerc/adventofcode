package puzzle01


object Puzzle01Mapper {
    private const val ELVES_DELIMITER = "\n\n"
    private const val CALORIES_DELIMITER = "\n"


    fun mapInput(input: String): List<Elf> {
        return input
            .split(ELVES_DELIMITER)
            .filter { it.trim().isNotEmpty() }
            .map { mapElf(it) }
    }

    private fun mapElf(elfPart: String): Elf {
        val calories = elfPart
            .split(CALORIES_DELIMITER)
            .filter { it.trim().isNotEmpty() }
            .map { it.toLong() }

        return Elf(calories)
    }
}
