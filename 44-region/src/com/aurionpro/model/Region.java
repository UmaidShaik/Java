package com.aurionpro.model;

public class Region {
	  private String sname;
	  private String fname;
	  private int regioncode;
	public Region(String sname, String fname, int regioncode) {
		super();
		this.sname = sname;
		this.fname = fname;
		this.regioncode = regioncode;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getRegioncode() {
		return regioncode;
	}
	public void setRegioncode(int regioncode) {
		this.regioncode = regioncode;
	}
	@Override
	public String toString() {
		return "Region [sname=" + sname + ", fname=" + fname + ", regioncode=" + regioncode + "]";
	}
	  
	  

}
