package com.example;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PokerUtils {

    public static CardType getCardType(String[] playerCards) {
        Integer[] playerCardsValue = changeStringToInteger(playerCards);
        Arrays.sort(playerCardsValue);
        if (isStraight(playerCardsValue)) {
            return CardType.STRAIGHT;
        }
        for (int index = 0; index < playerCardsValue.length - 1; index++) {
            if (isThreeOfAKind(playerCardsValue, index)) {
                return CardType.THREE_OF_KIND;
            } else if (isTwoPairs(playerCardsValue, index)) {
                return CardType.TWO_PAIR;
            } else if (playerCardsValue[index] == playerCardsValue[index + 1]) {
                return CardType.PAIR;
            }
        }
        return CardType.HIGH_CARD;
    }

    private static boolean isStraight(Integer[] playerCardsValue) {
        for (int index = 0; index < playerCardsValue.length - 1; index++) {
            if (playerCardsValue[index] + 1 != playerCardsValue[index + 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isTwoPairs(Integer[] playerCardsValue, int index) {
        return playerCardsValue[index] == playerCardsValue[index + 1]
                && playerCardsValue[index + 2] == playerCardsValue[index + 3];
    }

    private static boolean isThreeOfAKind(Integer[] playerCardsValue, int index) {
        return playerCardsValue[index] == playerCardsValue[index + 1]
                && playerCardsValue[index] == playerCardsValue[index + 2];
    }

    public static Integer[] changeStringToInteger(String[] playerCards) {
        Integer[] result = new Integer[5];
        for (int index = 0; index < playerCards.length; index++) {
            if(playerCards[index].length() == 3){
                result[index] = Integer.parseInt(playerCards[index].substring(0,2));
            }else{
                result[index] = getIntegerValue(Character.toString(playerCards[index].charAt(0)));
            }

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


    public static Integer getHighFrequencyNumberFromArray(Integer[] numbers) {
        return Stream.of(numbers).collect(Collectors.groupingBy(Integer::valueOf))
                .values()
                .stream()
                .sorted((a, b) -> b.size() - a.size())
                .collect(Collectors.toList()).get(0).get(0);
    }
}
