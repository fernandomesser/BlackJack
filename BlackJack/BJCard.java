package BlackJack;

import java.awt.Color;

import BlackJackBase.PCard;

public class BJCard extends PCard {

	int rank;
	int suit;
	boolean hidden;

	public final static int ACE = 1;
	public final static int TWO = 2;
	public final static int TRHEE = 3;
	public final static int FOUR = 4;
	public final static int FIVE = 5;
	public final static int SIX = 6;
	public final static int SEVEN = 7;
	public final static int EIGHT = 8;
	public final static int NINE = 9;
	public final static int TEN = 10;
	public final static int KNIGHT = 11;
	public final static int JACK = 12;
	public final static int QUEEN = 13;
	public final static int KING = 14;

	public final static int SPADE = 1;
	public final static int HEART = 2;
	public final static int DIAMOND = 3;
	public final static int CLUB = 4;

	public BJCard(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
		hidden = false;
	}

	public int getRank() {
		return rank;
	}

	public int getSuit() {
		return suit;
	}

	public void setRank(int r) {
		rank = r;
	}

	public void setSuit(int s) {
		suit = s;
	}

	@Override
	public void hideCard() {
		hidden = true;

	}

	@Override
	public void showCard() {
		hidden = false;

	}

	@Override
	public boolean isHidden() {
		return hidden;
	}

	@Override
	public String getText() {
		String card = "";
		switch (rank) {
		case ACE:
			card = "A";
			break;
		case TWO:
			card = "2";
			break;
		case TRHEE:
			card = "3";
			break;
		case FOUR:
			card = "4";
			break;
		case FIVE:
			card = "5";
			break;
		case SIX:
			card = "6";
			break;
		case SEVEN:
			card = "7";
			break;
		case EIGHT:
			card = "8";
			break;
		case NINE:
			card = "9";
			break;
		case TEN:
			card = "10";
			break;
		case JACK:
			card = "J";
			break;
		case QUEEN:
			card = "Q";
			break;
		case KING:
			card = "K";
			break;
		case KNIGHT:
			card = "Kn";
			break;
		default:

		}

		switch (suit) {
		case SPADE:
			card += "\u2664";
			break;
		case HEART:
			card += "\u2665";
			break;
		case DIAMOND:
			card += "\u2666";
			break;
		case CLUB:
			card += "\u2667";
			break;
		}

		return card;

	}

	@Override
	public Color getFontColor() {
		if (suit == BJCard.HEART || suit == BJCard.DIAMOND) {
			return Color.RED;

		} else {
			return Color.BLACK;
		}
	}

	@Override
	public Color getFaceColor() {
		if (hidden) {
			return new Color(20, 100, 20);
		} else {
			if (this.suit == BJCard.DIAMOND || this.suit == BJCard.HEART) {
				return Color.WHITE;
			} else {
				return Color.WHITE;

			}
		}

	}

	@Override
	public Color getBackColor() {
		return new Color(20, 100, 20);

	}

	@Override
	public Color getBorderColor() {
		return Color.BLACK;
	}

	@Override
	public Color getStripeColor() {
		return new Color(100, 100, 100);
	}

}
