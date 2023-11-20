package com.aurionpro.model;

public class FixedDeposit {
    private int accountNumber;
    private String name;
    private double principal;
    private int duration;
    private FestivalInterest festival;

    public FixedDeposit(int accountNumber, String name, double principal, int duration, FestivalInterest festival) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.principal = principal;
        this.duration = duration;
        this.festival = festival;
    }

    // Getter and setter methods for fields
    

    public double calculateSimpleInterest() {
        double rate = festival.getInterestRate();
        return principal * rate * duration / 100;
    }

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public FestivalInterest getFestival() {
		return festival;
	}

	public void setFestival(FestivalInterest festival) {
		this.festival = festival;
	}
}
