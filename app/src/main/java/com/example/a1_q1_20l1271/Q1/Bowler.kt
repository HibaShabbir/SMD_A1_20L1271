package com.example.a1_q1_20l1271.Q1

// Define the Bowler interface inheriting from Cricketer with additional properties and overrides.
interface Bowler : Cricketer {
    var wickets: Int
    var bowlerRanking: Int

    override fun print() {
        super<Cricketer>.print()  // Call the print method from Cricketer interface
        println("=======================================")
        println("| Stats of bowling of the player")
        println("| Wickets: $wickets")
        println("| Bowler Ranking: $bowlerRanking")
        println("=======================================")
    }

    fun printBowlerStats() {
        println("=======================================")
        println("| Stats of bowling of the player")
        println("| Wickets: $wickets")
        println("| Bowler Ranking: $bowlerRanking")
        println("=======================================")
    }

    fun getRanking(): Int {
        return bowlerRanking
    }
}