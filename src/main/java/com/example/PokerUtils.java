package com.example;

public class PokerUtils {
    public static Integer[] changeStringToInteger(String[] playerCards) {
        Integer[] result = new Integer[5];
        for (int index = 0; index < playerCards.length; index++) {
            result[index] = getIntegerValue(Character.toString(playerCards[index].charAt(0)));
        }
        return result;
    }

    public static Integer getIntegerValue(String value) {
        switch (value) {
            case "A":
                return 14;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            default:
                return Integer.parseInt(value);
        }
    }
}
