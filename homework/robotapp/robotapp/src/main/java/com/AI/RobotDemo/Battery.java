package com.AI.RobotDemo;

public class Battery {

	private String name;
	private double capacity;

	public Battery(double capacity, String name) {
		this.capacity = capacity;
		this.name = name;
	}

	public void chargeBattery() {
		System.out.println("Charging battery...");
	}

	public void drainBattery(Double rateOfDraining) {
		System.out.println("Draining battery...");
	}

	public String getName() {
		return name;
	}

	public double getCapacity() {
		return capacity;
	}
}
