package BlackJackTest;

import java.awt.Color;

import BlackJack.BJCard;
import BlackJack.BJDeck;
import BlackJack.BJHand;
import BlackJackBase.PCard;
import BlackJackBase.PDeck;
import BlackJackBase.PGame;

public class PlayBlackJack {

	public static void main(String[] args) {

		PGame.setBackgroundColor(new Color(28, 214, 205));
		PGame.setBannerColor(new Color(6,99,82));
		PGame.setBannerTextColor(new Color(254,247,204));
		PGame.setStatusTextColor(new Color(106,90,15));
		PGame.setButtonColor(new Color(3,78,71));
		PGame.setButtonHighlightColor(new Color(0,85,73));
		PGame.setButtonTextColor(new Color(254,247,204));
		PGame.setButtonTextColor(new Color(254,247,204));
		PGame.setFont("Serif");
		
		

		BJDeck deck = new BJDeck();
		BJHand player = new BJHand();
		BJHand dealer = new BJHand();
		PGame.run(deck, dealer, player);

	}

}
