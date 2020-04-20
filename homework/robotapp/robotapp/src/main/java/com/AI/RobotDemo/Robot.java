package com.AI.RobotDemo;

import com.AI.RobotDemo.Utility.Weight;

public class Robot {
	Battery battery;

	public Robot(Battery battery) {
		this.battery = battery;
	}

	public void walk(double distance) {
		walk(null, distance);
	}

	public void walk(Weight weight, double distance) {
		if (distance > 0) {
			if (weight != null && weight.getWeight() >= 0) {
				double rateOfbatteryDrain = 0.02 * weight.getWeight();
				this.battery.drainBattery(rateOfbatteryDrain);
			} else {
				this.battery.drainBattery(null);

			}
		}
	}
	// }

	public Battery getBattery() {
		return this.battery;
	}
}
