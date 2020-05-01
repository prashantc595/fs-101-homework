package com.mk.xebia.solid.dip;

import java.util.Random;

public class TirednessIndicator {

	private TirednessLevels tirednessLevels;

	Random random = new Random();
	int tiredenssLevel = random.nextInt(99);

	public void tirednesslevel() {

		if (tiredenssLevel < 33) {
			this.tirednessLevels = TirednessLevels.NOT_TIRED;
		} else if (tiredenssLevel < 66) {
			this.tirednessLevels = TirednessLevels.MILDLY_TIRED;
		} else {
			this.tirednessLevels = TirednessLevels.TIRED;
		}

	}

	public TirednessLevels getTirednessLevels() {
		return tirednessLevels;
	}

	public void setTirednessLevels(TirednessLevels tirednessLevels) {
		this.tirednessLevels = tirednessLevels;
	}

}
