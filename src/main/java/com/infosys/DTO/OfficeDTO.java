package com.infosys.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="off_table")

public class OfficeDTO {

	
	@Id
	@Column(name="offName")
	String offName;
	@Column(name="offStreet")
	String offStreet;
	String offCity;
	@Column(name="offId")
	int offId;
	
	public OfficeDTO() {
		super();
	}

	public OfficeDTO(String offName, String offStreet, String offCity, int offId) {
		super();
		this.offName = offName;
		this.offStreet = offStreet;
		this.offCity = offCity;
		this.offId = offId;
	}

	public String getOffName() {
		return offName;
	}

	public void setOffName(String offName) {
		this.offName = offName;
	}

	public String getOffStreet() {
		return offStreet;
	}

	public void setOffStreet(String offStreet) {
		this.offStreet = offStreet;
	}

	public String getOffCity() {
		return offCity;
	}

	public void setOffCity(String offCity) {
		this.offCity = offCity;
	}

	public int getOffId() {
		return offId;
	}

	public void setOffId(int offId) {
		this.offId = offId;
	}

	@Override
	public String toString() {
		return "OfficeDTO [offName=" + offName + ", offStreet=" + offStreet + ", offCity=" + offCity + ", offId="
				+ offId + "]";
	}
	
	
}