package com.aurionpro.model;

import java.util.List;

public class Student {
 private int id;
 private String name;
 private double percentage;
 private List<String> hoobies;
public Student(int id, String name, double percentage, List<String> hoobies) {
	super();
	this.id = id;
	this.name = name;
	this.percentage = percentage;
	this.hoobies = hoobies;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
public List<String> getHoobies() {
	return hoobies;
}
public void setHoobies(List<String> hoobies) {
	this.hoobies = hoobies;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + ", hoobies=" + hoobies + "]";
}
 
 
}
