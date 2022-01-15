package com.example.kotlinbootcampweek1homeworks.homework2

class Functions {

    // Question 1
    fun convertDegreeToFahrenheit(degree: Int): Double {
        val fahrenheit = (degree * 1.8) + 32
        return fahrenheit
    }

    // Question 2
    fun calculatePerimeterOfRectangle(shortSide: Int, longSide: Int) {
        val perimeterOfRectangle = 2 * shortSide + 2 * longSide
        println("A rectangle with a short side length of $shortSide and a long side length of $longSide has a perimeter of $perimeterOfRectangle.")
    }

    // Question 3
    fun factorialCalculation(num: Int): Int {
        var factorial = 1
        if (num == 1) {
            return factorial
        } else {
            factorial = num * factorialCalculation(num - 1)
        }
        return factorial
    }

    // Question 4
    fun findNumberOfLetters(letter: Char, word: String) {
        var countLetter = 0
        for (ch in word) {
            if (ch == letter) {
                countLetter += 1
            }
        }
        println("The letter $letter occurs $countLetter times in the word $word.")
    }

    // Question 5
    fun calculateSumOfInteriorAngles(numberOfSides: Int): Int {
        val sumOfInteriorAngles = (numberOfSides - 2) * 180
        return sumOfInteriorAngles
    }

    // Question 6
    fun calculateSalary(numberOfDaysOfWorked: Int): Int {
        val salary: Int
        val numberOfHoursOfWorked = numberOfDaysOfWorked * 8
        val workingHourWage = 10
        val overtimeWage = 20
        if (numberOfHoursOfWorked <= 160) {
            salary = workingHourWage * numberOfHoursOfWorked
        } else {
            salary = 160 * workingHourWage + (numberOfHoursOfWorked - 160) * overtimeWage
        }
        return salary
    }

    // Question 7
    fun calculateInternetBill(internetQuota: Int): Int {
        val bill: Int
        if (internetQuota <= 50) {
            bill = 100
        } else {
            bill = 100 + (internetQuota - 50) * 4
        }
        return bill
    }

}