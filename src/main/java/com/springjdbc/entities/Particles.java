package com.springjdbc.entities;

public class Particles {
	
	private int partId;
	private String partName;
	private String partDescription;
	private float price;
	private String dateStart;
	private int vendorId;
	public int getPartId() {
		return partId;
	}
	public void setPartId(int partId) {
		this.partId = partId;
	}
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDateStart() {
		return dateStart;
	}
	@Override
	public String toString() {
		return "Particles [partId=" + partId + ", partName=" + partName + ", partDescription=" + partDescription
				+ ", price=" + price + ", dateStart=" + dateStart + ", vendorId=" + vendorId + "]";
	}
	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}
	public int getVendorId() {
		return vendorId;
	}
	
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	
	public Particles(int partId, String partName, String partDescription, float price, String dateStart, int vendorId) {
		super();
		this.partId = partId;
		this.partName = partName;
		this.partDescription = partDescription;
		this.price = price;
		this.dateStart = dateStart;
		this.vendorId = vendorId;
	}
	
	public Particles() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
