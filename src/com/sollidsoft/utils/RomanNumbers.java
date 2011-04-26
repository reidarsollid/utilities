package com.sollidsoft.utils;

import java.util.*;

/**
 * User: Reidar Sollid
 * Date: 25.04.11
 * Time: 23.31
 */
public class RomanNumbers {

    /*
     M    1000            X   10
      D     500            V    5
      C     100            I    1
      L      50

       M    1000            X   10
      CM    900            IX   9
      D     500            V    5
      CD    400            IV   4
      C     100            I    1
      XC     90
      L      50
      XL     40
     */

    enum Romans {
        I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900), M(1000);
        private final int arabic;
        private static SortedMap<Integer, Romans> integerRomansMap = new TreeMap<Integer, Romans>();

        static {
            for (Romans romans : Romans.values()) {
                integerRomansMap.put(romans.getArabic(), romans);
            }
        }

        Romans(int arabic) {
            this.arabic = arabic;
        }

        public int getArabic() {
            return this.arabic;
        }

        public static boolean contains(int arabic) {
            return integerRomansMap.containsKey(arabic);
        }

        public static Romans fromArabic(int arabic) {
            return integerRomansMap.get(arabic);
        }

        public static Romans getHighest(int arabic) {
            Romans lastROman = Romans.I;
            for (Integer integer : integerRomansMap.keySet()) {
                if (arabic - integer < 0) {
                    return lastROman;
                }
                lastROman = integerRomansMap.get(integer);

            }
            return lastROman;
        }
    }

    public static String toRoman(final int number) {
        String result = "";
        int rest = number;
        while (rest >= 1) {
            if (Romans.contains(rest)) {
                result += Romans.fromArabic(rest);
                return result;
            }

            Romans roman = Romans.getHighest(rest);
            rest -= roman.getArabic();
            result += roman.name();
        }
        return result;
    }


}
