package com.example.a1_q1_20l1271.Q1

// Define the Batsman interface inheriting from Cricketer with additional properties and overrides.
interface Batsman : Cricketer {
    var score: Int
    var batsmanRanking: Int

    override fun print() {
        super<Cricketer>.print()  // Call the print method from Cricketer interface
        println("=======================================")
        println("| Stats of batting of the player")
        println("| Score: $score")
        println("| Batsman Ranking: $batsmanRanking")
        println("=======================================")
    }

    fun printBatsmanStats() {
        println("=======================================")
        println("| Stats of batting of the player")
        println("| Score: $score")
        println("| Batsman Ranking: $batsmanRanking")
        println("=======================================")
    }

    fun getRanking(): Int {
        return batsmanRanking
    }
}