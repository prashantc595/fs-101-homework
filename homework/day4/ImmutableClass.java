package com.xebia.day4;

import java.util.Date;

public final class ImmutableClass{

	  private final int addYears;
	  private final int addMonths;
	  private final int addDays;
	  private final Date ImmutableDate;
	  
	  
	  
	public ImmutableClass(int addYears, int addMonths, int addDays, Date immutableDate) {
		super();
		this.addYears = addYears;
		this.addMonths = addMonths;
		this.addDays = addDays;
		this.ImmutableDate = new Date(immutableDate.getTime());
	}

	public int getAddYears() {
		return addYears;
	}
	
	public int getAddMonths() {
		return addMonths;
	}
	
	public int getAddDays() {
		return addDays;
	}
	
	public Date getImmutableDate() {
		return new Date(ImmutableDate.getTime());
	}
	
	  
	  
	  
	  
}
