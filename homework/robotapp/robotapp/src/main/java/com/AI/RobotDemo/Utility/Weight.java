package com.AI.RobotDemo.Utility;

public class Weight {
	Double weight;
	WeightUnit weightunit;

	public WeightUnit getWeightunit() {
		return weightunit;
	}

	public void setWeightunit(WeightUnit weightunit) {
		this.weightunit = weightunit;
	}

	public Weight(Double weight, WeightUnit weightUnit) {
		this.weight = weight;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}
}
