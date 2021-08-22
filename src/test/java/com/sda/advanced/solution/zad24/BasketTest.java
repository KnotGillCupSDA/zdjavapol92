package com.sda.advanced.solution.zad24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BasketTest {

	private Basket basket;

	@BeforeEach
	void setUp() {
		basket = new Basket();
	}

	@Test
	void shouldBeAbleToAddAndRemoveFromBasket() {
		basket.addToBasket();
		basket.removeFromBasket();
	}

	@Test
	void shouldThrowExceptionWhenRemovingFromEmptyBasket() {
		assertThrows(BasketEmptyException.class, () -> basket.removeFromBasket());
	}

	@Test
	void shouldThrowExceptionWhenTooManyItems() {
		for (int i = 0; i < 10; i++) {
			basket.addToBasket();
		}

		assertThrows(BasketFullException.class, () -> basket.addToBasket());
	}
}