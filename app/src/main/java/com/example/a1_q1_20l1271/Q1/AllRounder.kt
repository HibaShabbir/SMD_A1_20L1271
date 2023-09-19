package com.example.a1_q1_20l1271.Q1

// Implement an AllRounder class that implements both Batsman and Bowler interfaces.
class AllRounder(
    name: String,
    age: Int,
    nationality: String,
    batsmanRanking: Int,
    score: Int,
    wickets: Int,
    bowlerRanking: Int
) : Cricketer, Batsman, Bowler {
    override var name: String = name
    override var age: Int = age
    override var nationality: String = nationality
    override var score: Int = score
    override var batsmanRanking: Int = batsmanRanking
    override var bowlerRanking: Int = bowlerRanking
    override var wickets: Int = wickets

    override fun print() {
        super<Cricketer>.print()
        super<Bowler>.printBowlerStats()
        super<Batsman>.printBatsmanStats()
    }

    override fun getRanking(): Int {
        val normalizedBatsmanRanking = 100 - batsmanRanking + 1
        val normalizedBowlerRanking = 100 - bowlerRanking + 1
        return (normalizedBatsmanRanking + normalizedBowlerRanking) / 2
    }
}