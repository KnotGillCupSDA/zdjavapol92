package com.sda.advanced.solution.zad11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CircleTest {

	@ParameterizedTest
	@MethodSource("circles")
	void shouldReturnProperRadius(Circle circle) {
		assertEquals(3.0, circle.getRadius());
	}

	@ParameterizedTest
	@MethodSource("circles")
	void shouldResize(Circle circle) {
		circle.resize(2.5);
		assertEquals(7.5, circle.getRadius());
	}

	private static Stream<Arguments> circles() {
		return Stream.of(
				Arguments.of(
						new CircleWithRadius(new Point2D(1, 1), new Point2D(4, 1))
				),
				Arguments.of(
						new CircleWithFactor(new Point2D(1, 1), new Point2D(4, 1))
				),
				Arguments.of(
						new CircleWith2Points(new Point2D(1, 1), new Point2D(4, 1))
				)
		);
	}
}