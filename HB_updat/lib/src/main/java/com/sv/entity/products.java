package com.sv.entity;

public class products {

	private int pId;
	private String pName;
	private String pCatagory;
	private float cost;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpCatagory() {
		return pCatagory;
	}
	public void setpCatagory(String pCatagory) {
		this.pCatagory = pCatagory;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Products [pId=" + pId + ", pName=" + pName + ", pCatagory=" + pCatagory + ", cost=" + cost + "]";
	}



}

