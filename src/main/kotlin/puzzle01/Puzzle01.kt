package puzzle01

import loadResource

object Puzzle01 {
    fun part1(input: List<Elf>): Long {
        return input.maxOf { it.totalCalories }
    }

    fun part2(input: List<Elf>): Long {
        return input
            .sortedByDescending { it.totalCalories }
            .take(3)
            .sumOf { it.totalCalories }
    }
}

fun main() {
    val rawSampleInput = loadResource("puzzle01-sample.txt")
    val sampleDataset = Puzzle01Mapper.mapInput(rawSampleInput)

    val rawInput = loadResource("puzzle01.txt")
    val dataSet = Puzzle01Mapper.mapInput(rawInput)

    require(Puzzle01.part1(sampleDataset) == 24000L)
    println(Puzzle01.part1(dataSet))

    require(Puzzle01.part2(sampleDataset) == 45000L)
    println(Puzzle01.part2(dataSet))
}
