package com.sda.advanced.solution.zad16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class RunnerTest {

	@Test
	void shouldBeClassifiedAsBeginner() {
		final Duration runningTime = Duration.parse("PT8H20M20S");
		assertEquals(Runner.BEGINNER, Runner.getFitnessLevel((int) runningTime.toMillis()));
		assertEquals(Runner.BEGINNER, Runner.getFitnessLevelDynamic((int) runningTime.toMillis()));
		assertEquals(RunnerDuration.BEGINNER, RunnerDuration.getFitnessLevel(runningTime));
	}

	@Test
	void shouldBeClassifiedAsIntermediate() {
		final Duration runningTime = Duration.parse("PT4H20M20S");
		assertEquals(Runner.INTERMEDIATE, Runner.getFitnessLevel((int) runningTime.toMillis()));
		assertEquals(Runner.INTERMEDIATE, Runner.getFitnessLevelDynamic((int) runningTime.toMillis()));
		assertEquals(RunnerDuration.INTERMEDIATE, RunnerDuration.getFitnessLevel(runningTime));
	}

	@Test
	void shouldBeClassifiedAsAdvanced() {
		final Duration runningTime = Duration.parse("PT2H20M20S");
		assertEquals(Runner.ADVANCED, Runner.getFitnessLevel((int) runningTime.toMillis()));
		assertEquals(Runner.ADVANCED, Runner.getFitnessLevelDynamic((int) runningTime.toMillis()));
		assertEquals(RunnerDuration.ADVANCED, RunnerDuration.getFitnessLevel(runningTime));
	}
}