


package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Maryam Khan
 * @version 10.02.2020
 */

 import java.util.Scanner;  
       
public class CardTrick {

     
    
    public static void main(String[] args) {
        
        
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setSuit(Card.SUITS[(int)(Math.random()*Card.SUITS.length)]);
           c.setValue((int)(Math.random()*13+1));
           magicHand[i]=c;
            
           }
        
        /*for (int i = 0; i < magicHand.length; i++) {
            System.out.println(magicHand[i].getSuit()+magicHand[i].getValue());*/
            
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please guess a card by entering a suit like: Clubs,Spades,Diamonds,Hearts:");
        String suitguess = input.nextLine();
        System.out.println("Please enter a value between 0-13");
        int valueguess=input.nextInt();
        
        
        for (int i=0;i<magicHand.length;i++) 
       {
          if(magicHand[i].getSuit().equals(suitguess) && magicHand[i].getValue()==valueguess){
          
              System.out.println("You guessed right!");
          }
           else
          {
              
              System.out.println("You guessed wrong");
          }
      }
        
         
    }
         
       
      
       
}
     





