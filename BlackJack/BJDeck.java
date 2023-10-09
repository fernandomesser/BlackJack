package BlackJack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import BlackJackBase.PCard;
import BlackJackBase.PDeck;

public class BJDeck implements PDeck {

	private ArrayList<BJCard> cards;

	// Constructor
	public BJDeck() {
		cards = new ArrayList<BJCard>();
		for (int i = 1; i <= BJCard.KING; i++) {
			for (int l = 1; l <= BJCard.CLUB; l++) {
				BJCard card = new BJCard(i, l);
				cards.add(card);
			}
		}
	}

	// Methods
	@Override
	public void shuffle() {
		Collections.shuffle(cards);

	}

	@Override
	public void addCard(PCard card) {
		cards.add((BJCard) card);
	}

	@Override
	public PCard dealCard() {
		if (cards.isEmpty()) {
			return null;
		} else {
			return cards.remove(cards.size() - 1);
		}
	}

	@Override
	public PCard dealHiddenCard() {
		if (cards.isEmpty()) {
			return null;

		} else {
			BJCard card = cards.remove(cards.size() - 1);
			card.hideCard();
			return card;
		}
	}

	@Override
	public int cardCount() {
		return cards.size();
	}

}
