package com.sda.advanced.solution.zad25;

public class Main {

	public static void main(String[] args) {
		final Basket basket = new Basket();

		try {

			basket.addToBasket();
			basket.removeFromBasket();
			basket.removeFromBasket();
			basket.removeFromBasket();
			basket.removeFromBasket();

			System.out.println("After removal");
		} catch (BasketFullException | BasketEmptyException e) {
			e.printStackTrace();
			System.out.println("Hello from catch block");
		}

		System.out.println("Still working");
	}
}
