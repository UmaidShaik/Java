package com.aurionpro.model;

public class Table implements Runnable {
 private int number;

public Table(int number) {
	super();
	this.number = number;
}

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}
  public synchronized void run() {
	  for(int i=1; i<=10;i++) {
		  System.out.println(number+" * "+i+" = "+(number*i));
	  }
  }
}
