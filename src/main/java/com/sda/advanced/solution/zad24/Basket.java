package com.sda.advanced.solution.zad24;

public class Basket {

	private int items;

	void addToBasket() {
		if (items >= 10) {
			throw new BasketFullException("Too many items in the basket");
		}
		items++;
	}

	void removeFromBasket() {
		if (items <= 0) {
			throw new BasketEmptyException("Can't remove from empty basket");
		}
		items--;
	}
}
