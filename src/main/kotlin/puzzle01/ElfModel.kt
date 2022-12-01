package puzzle01

data class Elf(val calories: List<Long>) {
    val totalCalories: Long = calories.sum()
}
