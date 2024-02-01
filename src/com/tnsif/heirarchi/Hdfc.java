package com.tnsif.heirarchi;

public class Hdfc extends Rbi{
	
	private String branchname;

	public Hdfc(String countryName, String bankid,String branchname) {
		super(countryName, bankid);
		this.branchname=branchname;
		// TODO Auto-generated constructor stub
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public String toString() {
		return "Hdfc [branchname=" + branchname + ", toString()=" + super.toString() + "]";
	}
	
	

}