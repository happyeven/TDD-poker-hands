package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author ZHUDO2
 * @Date 8/26/2020 1:31 PM
 * @Version 1.0
 */
public class PokerTest {

  @Test
  void should_return_player1_win_when_compare_cards_given_5D8C9SJSAC_and_2C5C7D8SQH() {
    //given
    String[] player1Cards = {"5D", "8C", "9S", "JS", "AC"};
    String[] player2Cards = {"2C", "5C", "7D", "8S", "QH"};
    PokerPlayer pokerPlayer = new PokerPlayer();
    //when
    String result = pokerPlayer.compare(player1Cards, player2Cards);
    //then
    Assertions.assertEquals("player1 win", result);
  }

  @Test
  void should_return_player2_win_when_compare_cards_given_2C5C7D8SQH_and_5D8C9SJSAC() {
    //given
    String[] player2Cards = {"5D", "8C", "9S", "JS", "AC"};
    String[] player1Cards = {"2C", "5C", "7D", "8S", "QH"};
    PokerPlayer pokerPlayer = new PokerPlayer();
    //when
    String result = pokerPlayer.compare(player1Cards, player2Cards);
    //then
    Assertions.assertEquals("player2 win", result);
  }

  @Test
  void should_return_tie_when_compare_cards_given_5D8C9SJSAC_and_5D8C9SJSAC() {
    //given
    String[] player1Cards = {"5D", "8C", "9S", "JS", "AC"};
    String[] player2Cards = {"5C", "8D", "9H", "JC", "AD"};
    PokerPlayer pokerPlayer = new PokerPlayer();
    //when
    String result = pokerPlayer.compare(player1Cards, player2Cards);
    //then
    Assertions.assertEquals("Tie", result);
  }
  @Test
  void should_return_player2_win_when_compare_cards_given_5D8C9SJSAC_and_5C8D9HQSAC() {
    //given
    String[] player1Cards = {"5D", "8C", "9S", "JS", "AC"};
    String[] player2Cards = {"5C", "8D", "9H", "QS", "AD"};
    PokerPlayer pokerPlayer = new PokerPlayer();
    //when
    String result = pokerPlayer.compare(player1Cards, player2Cards);
    //then
    Assertions.assertEquals("player2 win", result);
  }
  @Test
  void should_return_player1_win_when_compare_cards_given_2C5C7D8SQH_and_2D6D6S8HQC() {
    //given
    String[] player1Cards = {"2D", "6D", "6S", "8H", "QC"};
    String[] player2Cards = {"2C", "5C", "7D", "8S", "QH"};
    PokerPlayer pokerPlayer = new PokerPlayer();
    //when
    String result = pokerPlayer.compare(player1Cards, player2Cards);
    //then
    Assertions.assertEquals("player1 win", result);
  }
  @Test
  void should_return_player2_win_when_compare_cards_given_2C7C7D8SQH_and_2D6D6S8HQC() {
    //given
    String[] player1Cards = {"2D", "6D", "6S", "8H", "QC"};
    String[] player2Cards = {"2C", "7C", "7D", "8S", "QH"};
    PokerPlayer pokerPlayer = new PokerPlayer();
    //when
    String result = pokerPlayer.compare(player1Cards, player2Cards);
    //then
    Assertions.assertEquals("player2 win", result);
  }
  
}
