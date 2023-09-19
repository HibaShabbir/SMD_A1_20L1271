package com.example.a1_q1_20l1271.Q1

fun main(args: Array<String>) {
        println("-------------------------------------\n")

        // Creating an instance of BowlerImpl
        val bowler = BowlerImpl("Waseem Akram", 60, "Pakistan", 1, 500)

        // Printing bowler's information
        println("\n\tBowlers Information:\n")
        println("\n-------------------------------------\n")
        bowler.print()
        println("\n-------------------------------------\n\n")
        // Creating an instance of AllRounder
        val allRounder = AllRounder("Imran Khan", 65, "Pakistan", 1, 1000, 300, 2)

        // Printing all-rounder's information
        println("-------------------------------------\n")
        println("\n\tAll-Rounder Information:\n")
        println("\n-------------------------------------\n")
        allRounder.print()
        println("\n-------------------------------------\n\n")

        // Creating an instance of BatsmanImpl
        val batsman = com.example.a1_q1_20l1271.Q1.BatsmanImpl("Babar Azam", 28, "Pakistan", 2, 1500)

        // Printing batsman's information
        println("-------------------------------------\n")
        println("\n\tBatsman Information:\n")
        println("\n-------------------------------------\n")
        batsman.print()
        println("\n-------------------------------------\n")
    }
