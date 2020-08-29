package com.example;

import java.util.Arrays;

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
        sort(player1CardsValue, player2CardsValue);
        for (int index = 0; index < player1CardsValue.length; index++) {
            if (player1CardsValue[index] > player2CardsValue[index]) {
                return 1;
            } else if (player1CardsValue[index] < player2CardsValue[index]) {
                return -1;
            }
        }
        return 0;
    }

    private void sort(Integer[] player1CardsValue, Integer[] player2CardsValue) {
        Arrays.sort(player1CardsValue);
        Arrays.sort(player2CardsValue);
    }

}
