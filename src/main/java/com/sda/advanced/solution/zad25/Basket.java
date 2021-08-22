package com.sda.advanced.solution.zad25;

public class Basket {

	private int items;

	void addToBasket() throws BasketFullException {
		if (items >= 10) {
			throw new BasketFullException("Too many items in the basket");
		}
		items++;
	}

	void removeFromBasket() throws BasketEmptyException {
		if (items <= 0) {
			throw new BasketEmptyException("Can't remove from empty basket");
		}
		items--;
	}
}
