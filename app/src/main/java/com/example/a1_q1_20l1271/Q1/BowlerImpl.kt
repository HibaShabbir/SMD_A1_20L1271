package com.example.a1_q1_20l1271.Q1

// Implement the Bowler interface in BowlerImpl.
class BowlerImpl(
    name: String,
    age: Int,
    nationality: String,
    bowlerRanking: Int,
    wickets: Int
) : Bowler {
    override var name: String = name
    override var age: Int = age
    override var nationality: String = nationality
    override var wickets: Int = wickets
    override var bowlerRanking: Int = bowlerRanking
        set(value) {
            if (value in 1..100) {
                field = value
            } else {
                throw IllegalArgumentException("Bowler ranking should be between 1 and 100")
            }
        }
    init {
        // Use the setter to validate and set the initial value
        this.bowlerRanking = bowlerRanking
    }

    //no need for this as its implementation gives default print implementation
    //since it is simple print function we can define in its interface
    /*override fun print() {
        super.print()
    }*/
}