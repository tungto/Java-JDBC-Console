package com.laptrinhjavaweb.dto;

import java.util.Date;

public class BuildingDTO {
	private Long id;

	private String name;

	private Integer numberOfBasement;

	private Integer buildingArea;

	private String district;

	private String ward;

	private String street;

	private String structure;

	private Integer costrent;

	private String costDescription;

	private String serviceCost;

	private String carCost;

	private String motorbikeCost;

	private String overtimeCost;

	private String electricityCost;

	private String deposit;

	private String payment;

	private String timerent;

	private String timeDecorator;

	private String managerName;

	private String managerPhone;

	private String type;

	private Date createdDate;

	private Date modifiedDate;

	private String createdBy;

	private String modifiedBy;
	// java bean is getter/setter => all access modifier for variable is private

	public Long getId() {
		return id;
	}

	public Integer getBuildingArea() {
		return buildingArea;
	}

	public String getWard() {
		return ward;
	}

	public Integer getCostrent() {
		return costrent;
	}

	public String getCostDescription() {
		return costDescription;
	}

	public String getServiceCost() {
		return serviceCost;
	}

	public String getCarCost() {
		return carCost;
	}

	public String getMotorbikeCost() {
		return motorbikeCost;
	}

	public String getOvertimeCost() {
		return overtimeCost;
	}

	public String getElectricityCost() {
		return electricityCost;
	}

	public String getDeposit() {
		return deposit;
	}

	public String getPayment() {
		return payment;
	}

	public String getTimerent() {
		return timerent;
	}

	public String getTimeDecorator() {
		return timeDecorator;
	}

	public String getManagerName() {
		return managerName;
	}

	public String getManagerPhone() {
		return managerPhone;
	}

	public String getType() {
		return type;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setBuildingArea(Integer buildingArea) {
		this.buildingArea = buildingArea;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public void setCostrent(Integer costrent) {
		this.costrent = costrent;
	}

	public void setCostDescription(String costDescription) {
		this.costDescription = costDescription;
	}

	public void setServiceCost(String serviceCost) {
		this.serviceCost = serviceCost;
	}

	public void setCarCost(String carCost) {
		this.carCost = carCost;
	}

	public void setMotorbikeCost(String motorbikeCost) {
		this.motorbikeCost = motorbikeCost;
	}

	public void setOvertimeCost(String overtimeCost) {
		this.overtimeCost = overtimeCost;
	}

	public void setElectricityCost(String electricityCost) {
		this.electricityCost = electricityCost;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public void setTimerent(String timerent) {
		this.timerent = timerent;
	}

	public void setTimeDecorator(String timeDecorator) {
		this.timeDecorator = timeDecorator;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public void setManagerPhone(String managerPhone) {
		this.managerPhone = managerPhone;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public Integer getNumberOfBasement() {
		return numberOfBasement;
	}

	public void setNumberOfBasement(Integer numberOfBasement) {
		this.numberOfBasement = numberOfBasement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
