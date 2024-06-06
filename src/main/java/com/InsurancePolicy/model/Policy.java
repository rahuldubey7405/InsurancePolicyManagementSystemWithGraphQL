package com.InsurancePolicy.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "policy")
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(nullable = false)
	private String policyNumber;
	@Column(nullable = false)
	private String policyHolderName;
	@Column(nullable = false)
	private String policyType;
	@Column(nullable = false)
	private Float premiumAmount;
	@Column(nullable = false)
	private LocalDate startDate;
	@Column(nullable = false)
	private LocalDate endDate;

	// Default constructor
	public Policy() {
	}

	// Parameterized constructor
	public Policy(String policyNumber, String policyHolderName, String policyType, Float premiumAmount,
			LocalDate startDate, LocalDate endDate) {
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.policyType = policyType;
		this.premiumAmount = premiumAmount;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// Getters and Setters
	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public Float getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(Float premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Policy{" + "policyNumber='" + policyNumber + '\'' + ", policyHolderName='" + policyHolderName + '\''
				+ ", policyType='" + policyType + '\'' + ", premiumAmount=" + premiumAmount + ", startDate=" + startDate
				+ ", endDate=" + endDate + '}';
	}
}
