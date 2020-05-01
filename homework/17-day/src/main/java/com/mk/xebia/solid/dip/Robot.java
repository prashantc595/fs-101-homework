package com.mk.xebia.solid.dip;

public class Robot{
	
	private Charge charge = new Battery();
	private TirednessIndicator tirednessIndicator = new TirednessIndicator();

	public Robot(Battery battery) {
	}

	public boolean canWalk() {
		return (charge.getRemainingCharge() > 5)
				&& (!tirednessIndicator.getTirednessLevels().equals(TirednessLevels.TIRED));
	}

}
