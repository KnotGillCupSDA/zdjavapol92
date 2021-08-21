package com.sda.advanced.solution.zad16;

import java.time.Duration;

public enum Runner {
	BEGINNER(480, Integer.MAX_VALUE),
	INTERMEDIATE(240, 480),
	ADVANCED(0, 240);

	private static final Runner[] VALUES = values();
	private final int minMinutes;
	private final int maxMinutes;

	Runner(int minMinutes, int maxMinutes) {
		this.minMinutes = minMinutes;
		this.maxMinutes = maxMinutes;
	}

	public static Runner getFitnessLevel(int runningTimeInMs) {
		int runningMinutes = runningTimeInMs / 60000;
		if (runningMinutes > BEGINNER.minMinutes) {
			return BEGINNER;
		}
		if (runningMinutes <= INTERMEDIATE.maxMinutes
				&& runningMinutes > INTERMEDIATE.minMinutes) {
			return INTERMEDIATE;
		}
		return ADVANCED;
	}

	public static Runner getFitnessLevelDynamic(int runningTimeInMs) {
		int runningMinutes = runningTimeInMs / 60000;
		for (Runner value : VALUES) {
			if (runningMinutes <= value.maxMinutes
					&& runningMinutes > value.minMinutes) {
				return value;
			}
		}
		//should never happen
		return BEGINNER;
	}
}
