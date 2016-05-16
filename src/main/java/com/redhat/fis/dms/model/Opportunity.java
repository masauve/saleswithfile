package com.redhat.fis.dms.model;

import javax.xml.bind.annotation.XmlAccessType; 
import javax.xml.bind.annotation.XmlAccessorType; 
import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType; 


@XmlRootElement(name = "oppo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
	    "custName",
	    "discount",
	    "phone",
	    "type",
	    "stage",
	    "vehicleId",
	    "openDate"
	})

public class Opportunity {
	
	@XmlElement()
	private String stage;
	
	@XmlElement()
	private String type;
	
	@XmlElement()
	private String vehicleId;
	
	@XmlElement()
	private String custName;
	
	@XmlElement()
	private String phone;
	
	@XmlElement()
	private Integer discount;
	
	@XmlElement()
	private String openDate;
	
	
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	public String getOpenDate() {
		return openDate;
	}
	public void setOpenDate(String opendate) {
		this.openDate = opendate;
	}
	
}
