package week6Assignment;

public class App {

  public static void main(String[] args) {
      //Deck size can be set her and passed to the other classes. 
      final int deckSize = 52;
      //initally determined to be 15 52/3.466666666666667 is 15
      final float bla = deckSize/3.466666666666667f;
      Deck deck = new Deck(bla);
      Player player1 = new Player("player 1");
      Player player2 = new Player("player 2");
      deck.shuffle();
      for (int i = 0; i < deckSize; i++) {
          if ( i % 2 == 0) {
              player1.draw(deck);
          } else {
              player2.draw(deck);
          }
      }
//      player1.describe();
//      player2.describe();
      for (int i = 0; i < (deckSize/2); i++) {
          Card player1Card = player1.flip();
          Card player2Card = player2.flip();
          if (player1Card.getValue() > player2Card.getValue()) {
              player1.incrementScore();
          }
          if (player1Card.getValue() < player2Card.getValue()) {
              player2.incrementScore();
          }
      }
      System.out.printf("player1 score = %d\n", player1.getScore());
      System.out.printf("player2 score = %d\n", player2.getScore());
      if (player1.getScore() > player2.getScore()) {
          System.out.println("Player1 is the winner!");
      } else if (player1.getScore() < player2.getScore()) {
          System.out.println("Player2 is the winner!");
      } else {
          System.out.println("It is a DRAW!");
      }


  }

}