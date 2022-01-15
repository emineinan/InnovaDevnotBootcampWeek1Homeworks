package com.example.kotlinbootcampweek1homeworks.homework2

fun main() {
    val functions = Functions()
    println("Homework 2 - Functions")

    val result1 = functions.convertDegreeToFahrenheit(100)
    println("Question 1: 100 degrees is equal to $result1 Fahrenheit.")

    print("Question 2: ")
    val result2 = functions.calculatePerimeterOfRectangle(10, 20)

    val result3 = functions.factorialCalculation(5)
    println("Question 3: The factorial of 5 is equal to $result3.")

    print("Question 4: ")
    val result4 = functions.findNumberOfLetters('a', "Innova Bootcamp")

    val result5 = functions.calculateSumOfInteriorAngles(3)
    println("Question 5: The sum of the interior angles of an 3-sided polygon is equal to $result5.")

    val result6 = functions.calculateSalary(30)
    println("Question 6: The salary of a person who works 30 days is $result6 ₺.")

    val result7 = functions.calculateInternetBill(55)
    println("Question 7: Internet billing fee is $result7 ₺.")
}