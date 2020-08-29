package com.example;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PokerHands {

    private static final String PLAYER1_WIN = "player1 win";
    private static final String PLAYER2_WIN = "player2 win";
    private static final String TIE = "Tie";

    public String play(String[] player1Cards, String[] player2Cards) {
        if (compareCard(player1Cards, player2Cards) > 0) {
            return PLAYER1_WIN;
        } else if (compareCard(player1Cards, player2Cards) < 0) {
            return PLAYER2_WIN;
        }
        return TIE;
    }

    private Integer compareCard(String[] player1Cards, String[] player2Cards) {
        if (!PokerUtils.getCardType(player1Cards).equals(PokerUtils.getCardType(player2Cards))) {
            return PokerUtils.getCardType(player1Cards).getWeight() - PokerUtils.getCardType(player2Cards).getWeight();
        }
        Integer[] player1CardsValue = PokerUtils.changeStringToInteger(player1Cards);
        Integer[] player2CardsValue = PokerUtils.changeStringToInteger(player2Cards);
        PokerUtils.sort(player1CardsValue, player2CardsValue);

        if (!PokerUtils.getCardType(player1Cards).equals(CardType.HIGH_CARD)) {
            return compareFrequencyNum(player1CardsValue, player2CardsValue);
        } else if (PokerUtils.getCardType(player1Cards).equals(CardType.HIGH_CARD)) {
            return compareHighCardNumber(player1CardsValue, player2CardsValue);
        }
        return 0;
    }

    private Integer compareHighCardNumber(Integer[] player1CardsValue, Integer[] player2CardsValue) {
        for (int index = player1CardsValue.length - 1; index >= 0; index--) {
            if (player1CardsValue[index] > player2CardsValue[index]) {
                return 1;
            } else if (player1CardsValue[index] < player2CardsValue[index]) {
                return -1;
            }
        }
        return 0;
    }

    private int compareFrequencyNum(Integer[] player1CardsValue, Integer[] player2CardsValue) {
        Integer player1HighFrequencyNum = getHighFrequencyNumberFromArray(player1CardsValue);
        Integer player2HighFrequencyNum = getHighFrequencyNumberFromArray(player2CardsValue);
        if (player1HighFrequencyNum > player2HighFrequencyNum) {
            return 1;
        } else if (player1HighFrequencyNum < player2HighFrequencyNum) {
            return -1;
        }
        return 0;
    }

    private Integer getHighFrequencyNumberFromArray(Integer[] numbers) {
        return Stream.of(numbers).collect(Collectors.groupingBy(Integer::valueOf))
                .values()
                .stream()
                .sorted((a, b) -> b.size() - a.size())
                .collect(Collectors.toList()).get(0).get(0);
    }

}
