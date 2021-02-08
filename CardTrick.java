package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author srinivsi
 * Maaz Tauseef
 * 991579356
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
              int max = 13;
            int min = 1;
            int range = max - min + 1;
            
            int randValue = (int)(Math.random() * range) + min;
            c.setValue(randValue);
            max = 3;
            min = 0;
            range = max - min + 1;
            
           int randSuit = (int)(Math.random() * range) + min;
            //c.setValue(insert call to random number generator here)
            c.setSuit(Card.SUITS[randSuit]);
            magicHand[i] = c;
          
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        System.out.println(magicHand[0].getSuit());

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
