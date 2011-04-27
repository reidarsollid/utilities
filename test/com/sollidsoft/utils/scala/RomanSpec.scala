package com.sollidsoft.utils.scala

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers


/**
 * User: Reidar Sollid
 * Date: 27.04.11
 * Time: 11.57
 */

class RomanSpec extends FlatSpec with ShouldMatchers {
  "A roman converter" should "convert a text string to an integer" in {
    RomanConversion fromRoman ("X") should equal(10)
    RomanConversion fromRoman ("XXIV") should equal(24)
    RomanConversion fromRoman ("MMMCMXCIX") should equal(3999)
  }

  "A roman converter" should "convert a integer to a text string" in {
    RomanConversion toRoman (10) should equal("X")
    RomanConversion toRoman (24) should equal("XXIV")
    RomanConversion toRoman (3999) should equal("MMMCMXCIX")
  }
}