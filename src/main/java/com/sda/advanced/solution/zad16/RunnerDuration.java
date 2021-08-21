package com.sda.advanced.solution.zad16;

import java.time.Duration;

public enum RunnerDuration {
	BEGINNER(480, Integer.MAX_VALUE),
	INTERMEDIATE(240, 480),
	ADVANCED(0, 240);

	private static final RunnerDuration[] VALUES = values();
	private final Duration minDuration;
	private final Duration maxDuration;

	RunnerDuration(int minMinutes, int maxMinutes) {
		this.minDuration = Duration.ofMinutes(minMinutes);
		this.maxDuration = Duration.ofMinutes(maxMinutes);
	}

	public static RunnerDuration getFitnessLevel(Duration runningTime) {
		for (RunnerDuration value : VALUES) {
			if (runningTime.compareTo(value.maxDuration) <= 0
					&& runningTime.compareTo(value.minDuration) > 0) {
				return value;
			}
		}
		//should never happen
		return BEGINNER;
	}
}
