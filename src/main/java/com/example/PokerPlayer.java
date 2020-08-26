package com.example;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Author ZHUDO2
 * @Date 8/26/2020 1:40 PM
 * @Version 1.0
 */
public class PokerPlayer {

  public String compare(String[] player1Cards, String[] player2Cards) {
    Integer[] player1CardsValue = changeStringToInteger(player1Cards);
    Integer[] player2CardsValue = changeStringToInteger(player2Cards);
    return comparePairCards(player1CardsValue, player2CardsValue);
  }

  private String compareSimpleCars(Integer[] player1CardsValue, Integer[] player2CardsValue) {
    for(int index = 0 ; index < player1CardsValue.length ; index ++ ){
      if(player1CardsValue[index] > player2CardsValue[index]){
        return "player1 win";
      }else if(player1CardsValue[index] < player2CardsValue[index]){
        return "player2 win";
      }
    }
    return "Tie";
  }

  private String comparePairCards(Integer[] player1CardsValue, Integer[] player2CardsValue) {
    Integer player1PairCardValue = getPairCardValue(player1CardsValue);
    Integer player2PairCardValue = getPairCardValue(player2CardsValue);
    if(player1PairCardValue == player2PairCardValue && player1PairCardValue ==0){
      return compareSimpleCars(player1CardsValue,player2CardsValue);
    }
    return player1PairCardValue > player2PairCardValue ? "player1 win" : "player2 win";
  }

  private Integer getMaxCard(Integer[] playerCards) {
    return Collections.max(Arrays.asList(playerCards));
  }

  private Integer[] changeStringToInteger(String[] playerCards) {
    Integer[] result = new Integer[5];
    for (int index = 0; index < playerCards.length; index++) {
      result[index] = getIntegerValue(Character.toString(playerCards[index].charAt(0)));
    }
    return result;
  }

  private Integer getIntegerValue(String value) {
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

  private Integer getPairCardValue(Integer[] playerCards) {
    Arrays.sort(playerCards);
    for (int index = 0; index < playerCards.length - 1; index++) {
      if(playerCards[index] == playerCards[index + 1]){
        return playerCards[index];
      }
    }
    return 0;
  }
}
