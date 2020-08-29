package com.example;

import java.util.Arrays;

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

    public static Integer isThreeOfAKind(Integer[] playerCardsValue) {
        Arrays.sort(playerCardsValue);
        for (int index = 0; index < playerCardsValue.length - 2; index++) {
            if (playerCardsValue[index] == playerCardsValue[index + 1]
                    && playerCardsValue[index] == playerCardsValue[index + 2]) {
                return playerCardsValue[index];
            }
        }
        return 0;
    }

    public static Integer getPairCardValue(Integer[] playerCards) {
        Arrays.sort(playerCards);
        for (int index = 0; index < playerCards.length - 1; index++) {
            if (playerCards[index] == playerCards[index + 1]) {
                return playerCards[index];
            }
        }
        return 0;
    }
}
