package com.AI.RobotDemo.ApplicationRunner;

import com.AI.RobotDemo.Battery;
import com.AI.RobotDemo.Robot;
import com.AI.RobotDemo.Utility.Weight;
import com.AI.RobotDemo.Utility.WeightUnit;

public class Application {
	public static void main(String[] args) {
		Battery battery = new Battery(4000, "EverReady");
		Robot robot = new Robot(battery);
		robot.walk(3.5);
		robot.getBattery().chargeBattery();
		robot.walk(2.5);

		// charging before walking
		robot.getBattery().chargeBattery();
		robot.walk(new Weight(3.0, WeightUnit.KG), 2);
	}
}
