package BlackJack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BJCardTest {

	@Test
	void testHideCard() {
		BJCard card = new BJCard(BJCard.TWO, BJCard.DIAMOND);
		card.hideCard();
		assertEquals(card.isHidden(), true);
	}

	@Test
	void testShowCard() {
		BJCard card = new BJCard(BJCard.TWO, BJCard.DIAMOND);
		card.showCard();
		assertEquals(card.isHidden(), false);
	}

	@Test
	void testIsHidden() {
		BJCard card = new BJCard(BJCard.TWO, BJCard.DIAMOND);
		card.hideCard();
		assertEquals(card.isHidden(), true);
		card.showCard();
		assertEquals(card.isHidden(), false);
	}

	@Test
	void testGetText() {
		BJCard card = new BJCard(BJCard.TWO, BJCard.DIAMOND);
		assertEquals(card.getText(), "2\u2666");
	}

	@Test
	void testGetRank() {
		BJCard card = new BJCard(BJCard.TWO, BJCard.DIAMOND);
		assertEquals(card.getRank(), BJCard.TWO);
	}

	@Test
	void testGetSuit() {
		BJCard card = new BJCard(BJCard.TWO, BJCard.DIAMOND);
		assertEquals(card.getSuit(), BJCard.DIAMOND);
	}

	@Test
	void testSetRank() {
		BJCard card = new BJCard(BJCard.TWO, BJCard.DIAMOND);
		card.setRank(BJCard.FIVE);
		assertEquals(card.getRank(), BJCard.FIVE);
	}

	@Test
	void testSetSuit() {
		BJCard card = new BJCard(BJCard.TWO, BJCard.DIAMOND);
		card.setSuit(BJCard.HEART);
		assertEquals(card.getSuit(), BJCard.HEART);
	}

}
