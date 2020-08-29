package com.example;

import java.util.Arrays;

public class PokerUtils {

    public static CardType getCardType(String[] playerCards){
        Integer[] playerCardsValue = changeStringToInteger(playerCards);
        Arrays.sort(playerCardsValue);
        for (int index = 0; index < playerCardsValue.length - 1; index++) {
            if (isThreeOfAKind(playerCardsValue, index)){
                return CardType.THREE_OF_KIND;
            }else if (playerCardsValue[index] == playerCardsValue[index + 1]) {
                return CardType.PAIR;
            }
        }
        return CardType.HIGH_CARD;
    }

    private static boolean isThreeOfAKind(Integer[] playerCardsValue, int index) {
        return playerCardsValue[index] == playerCardsValue[index + 1]
                && playerCardsValue[index] == playerCardsValue[index + 2];
    }

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


    public static void sort(Integer[] player1CardsValue, Integer[] player2CardsValue) {
        Arrays.sort(player1CardsValue);
        Arrays.sort(player2CardsValue);
    }
}
