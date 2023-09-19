package com.example.a1_q1_20l1271.Q1

// Implement the Batsman interface in BatsmanImpl.
class BatsmanImpl(
    name: String,
    age: Int,
    nationality: String,
    batsmanRanking: Int,
    score: Int
) : Batsman {
    override var name: String = name
    override var age: Int = age
    override var nationality: String = nationality
    override var score: Int = score
    override var batsmanRanking: Int = batsmanRanking
        set(value) {
            if (value in 1..100) {
                field = value
            } else {
                throw IllegalArgumentException("Batsman ranking should be between 1 and 100")
            }
        }

    init {
        // Use the setter to validate and set the initial value
        this.batsmanRanking = batsmanRanking
    }


    //no need for this as its implementation gives default print implementation
    //since it is simple print function we can define in its interface
    /*override fun print() {
        super.print()
    }*/
}