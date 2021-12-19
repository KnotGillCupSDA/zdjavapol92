package com.sda.testing.solution.mockito;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sda.advanced.solution.zad17.ConversionType;
import com.sda.advanced.solution.zad17.ConversionTypeWithFunction;
import com.sda.advanced.solution.zad17.Converter;

@ExtendWith(MockitoExtension.class)
public class Playground {

	@Mock
	private static Converter converter;

	@ParameterizedTest
	@MethodSource("converters")
	void funWithMocks(Converter converter) {
		System.out.println(converter.convert(1.0, ConversionType.METERS_TO_YARDS));
		System.out.println(converter.convert(7.0, ConversionType.METERS_TO_YARDS));
		System.out.println(converter.convert(7.0, ConversionType.YARDS_TO_METERS));
		System.out.println(converter.convert(7.0, ConversionTypeWithFunction.METERS_TO_YARDS));
	}

	public static Stream<Converter> converters() {

		Converter mock = Mockito.mock(Converter.class);
		when(mock.convert(anyDouble(), any(ConversionType.class))).thenReturn(1.0);
		when(mock.convert(7.0, ConversionType.METERS_TO_YARDS))
				.thenReturn(-4.0);

		Converter spy = spy(new Converter());
		doReturn(3.0).when(spy).convert(7.0, ConversionType.METERS_TO_YARDS);

		return Stream.of(
				new Converter(),
				mock,
				//converter,
				spy
		);
	}
}
