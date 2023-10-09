package BlackJack;

import java.util.ArrayList;

import BlackJackBase.PCard;
import BlackJackBase.PHand;

public class BJHand implements PHand {

	ArrayList<BJCard> hand;

	public BJHand() {

		hand = new ArrayList<BJCard>();

	}

	@Override
	public int getSize() {
		return hand.size();
	}

	@Override
	public void addCard(PCard card) {
		hand.add((BJCard) card);
	}

	@Override
	public PCard getCard(int index) {
		return hand.get(index);
	}

	@Override
	public PCard removeCard(int index) {
		PCard removed = hand.get(index);
		hand.remove(index);
		return removed;
	}

	@Override
	public int getValue() {
		int value = 0;
		for (BJCard card : hand) {
			if (card.getRank() > 1 && card.getRank() < 11) {
				value += card.getRank();
			}
			if (card.getRank() > 10) {
				value += 10;
			}
			if (card.getRank() == 1) {
				if (value < 11) {
					value += 11;
				} else {
					value += 1;
				}
			}
		}
		return value;
	}

}
