package com.sda.advanced.solution.zad25;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasketTest {

	private Basket basket;

	@BeforeEach
	void setUp() {
		basket = new Basket();
	}

	@Test
	void shouldBeAbleToAddAndRemoveFromBasket() throws BasketFullException, BasketEmptyException {
		basket.addToBasket();
		basket.removeFromBasket();
	}

	@Test
	void shouldThrowExceptionWhenRemovingFromEmptyBasket() {
		assertThrows(BasketEmptyException.class, () -> basket.removeFromBasket());
	}

	@Test
	void shouldThrowExceptionWhenTooManyItems() throws BasketFullException {
		for (int i = 0; i < 10; i++) {
			basket.addToBasket();
		}

		assertThrows(BasketFullException.class, () -> basket.addToBasket());
	}
}
