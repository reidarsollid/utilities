package com.sollidsoft.utils.scala

import annotation.tailrec

/**
 * User: Reidar Sollid
 * Date: 27.04.11
 * Time: 09.46
 */

trait RomanConversion {
  def theNumbers = 0 :: 1 :: 4 :: 5 :: 9 :: 10 :: 40 :: 50 :: 90 :: 100 :: 400 :: 500 :: 900 :: 1000 :: Nil

  def fromRoman(roman: String): Int = {
    @tailrec
      def fromRoman(roman: List[Char], result: Int): Int =
        roman match {
          case 'I' :: 'V' :: rest => fromRoman(rest, result + 4)
          case 'I' :: 'X' :: rest => fromRoman(rest, result + 9)
          case 'I' :: rest => fromRoman(rest, result + 1)
          case 'V' :: rest => fromRoman(rest, result + 5)
          case 'X' :: 'L' :: rest => fromRoman(rest, result + 40)
          case 'X' :: 'C' :: rest => fromRoman(rest, result + 90)
          case 'X' :: rest => fromRoman(rest, result + 10)
          case 'L' :: rest => fromRoman(rest, result + 50)
          case 'C' :: 'D' :: rest => fromRoman(rest, result + 400)
          case 'C' :: 'M' :: rest => fromRoman(rest, result + 900)
          case 'C' :: rest => fromRoman(rest, result + 100)
          case 'D' :: rest => fromRoman(rest, result + 500)
          case 'M' :: rest => fromRoman(rest, result + 1000)
          case Nil => result
        }
    fromRoman(roman toList, 0)
  }

  def toRoman(arabic: Int): String = {
    @tailrec
    def builder(number: Int, romanLiteral: StringBuilder): String = {
      decrease(number) match {
        case 1000 => builder(number - 1000, romanLiteral.append("M"))
        case 900 => builder(number - 900, romanLiteral.append("CM"))
        case 500 => builder(number - 500, romanLiteral.append("C"))
        case 400 => builder(number - 400, romanLiteral.append("CD"))
        case 100 => builder(number - 100, romanLiteral.append("C"))
        case 90 => builder(number - 90, romanLiteral.append("XC"))
        case 50 => builder(number - 50, romanLiteral.append("L"))
        case 40 => builder(number - 40, romanLiteral.append("XL"))
        case 10 => builder(number - 10, romanLiteral.append("X"))
        case 9 => builder(number - 9, romanLiteral.append("IX"))
        case 5 => builder(number - 5, romanLiteral.append("V"))
        case 4 => builder(number - 4, romanLiteral.append("IV"))
        case 1 => builder(number - 1, romanLiteral.append("I"))
        case _ => romanLiteral.toString()
      }
    }
    val stringBuilder = new StringBuilder()
    builder(arabic, stringBuilder)
  }

  def decrease(rest: Int): Int = {
    theNumbers.reverse.filter(n => n <= rest).head
  }
}

//Companion object
object RomanConversion extends RomanConversion