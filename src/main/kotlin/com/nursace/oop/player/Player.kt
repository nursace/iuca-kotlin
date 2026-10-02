package com.nursace.oop.player

class Player(var scores: Int, var health: Int, var armor: Int, var mana: Double) {

    fun increaseScore(score: Int) {
        this.scores += score
    }

    fun takeDamage(damage: Int) {
        val newDamage = damage - this.armor
        if (newDamage > 0) {
            this.health -= newDamage
        }
    }

    fun heal(hp: Int) {
        this.health += hp
    }

    // fireball
    fun skill1() {
        if (this.mana > 15) {
            println("Casting Fireball!")
            this.mana -= 15
        } else {
            println("Out of mana.")
        }
    }

    // freezing
    fun skill2() {
        if (this.mana > 30) {
            println("Casting Freezing!")
            this.mana -= 30
        } else {
            println("Out of mana.")
        }
    }

    // earthquake
    fun skill3() {
        if (this.mana > 80) {
            println("Casting Earthquake!")
            this.mana -= 80
        } else {
            println("Out of mana.")
        }
    }

    fun fillMana(mana: Double) {
        this.mana += mana
    }

    fun printStats() {
        println("Player Score: $scores")
        println("Player Health: $health")
        println("Player Armor: $armor")
        println("Player Mana: $mana")
        println("\n\n------------\n\n")
    }
}

fun main() {
    val player = Player(scores = 0, health = 100, armor = 3, mana = 90.0)

    player.printStats()

    player.increaseScore(5)

    player.printStats()

    player.takeDamage(20)
    player.printStats()

    player.skill3()
    player.printStats()
    player.skill3()
    player.printStats()
}

