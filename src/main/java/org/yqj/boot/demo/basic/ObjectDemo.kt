package org.yqj.boot.demo.basic

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2020/9/19
 * Email: yaoqijunmail@foxmail.com
 */

fun main() {
//    val s = List(2) { it * 2 }
//    println(1..2)

//    val oddNumbers = sequence {
//        yield(1)
//        yieldAll(listOf(3, 5))
//        yieldAll(generateSequence(7) { it + 2 })
//    }
//    println(oddNumbers.take(5).toList())

//    val words = "The quick brown fox jumps over the lazy dog".split(" ")
//    val lengthsList = words.filter { println("filter: $it"); it.length > 3 }
//            .map { println("length: ${it.length}"); it.length }
//            .take(4)
//
//    println("Lengths of first 4 words longer than 3 chars:")
//    println(lengthsList)

//    val words = "The quick brown fox jumps over the lazy dog".split(" ")
//    val wordsSequence = words.asSequence()
//
//    val lengthsSequence = wordsSequence.filter { println("filter: $it"); it.length > 3 }
//            .map { println("length: ${it.length}"); it.length }
//            .take(4)
//    println("Lengths of first 4 words longer than 3 chars")
//    println(lengthsSequence.toList())

//    val numbers = listOf("one", "two", "three", "four", "five", "six")
//    println(numbers.takeWhile { !it.startsWith('f') })
//    println(numbers.takeLastWhile { it != "three" })
//    println(numbers.dropWhile { it.length == 3 })
//    println(numbers.dropLastWhile { it.contains('i') })

    val numbers = (0..13).toList()
    println(numbers.chunked(3))
}