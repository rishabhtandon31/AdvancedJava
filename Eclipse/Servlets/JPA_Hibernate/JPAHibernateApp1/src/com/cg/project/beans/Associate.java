package com.cg.project.beans;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Associate {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int associateID;
	private String firstName, lastName, department, designation, pancard, emailId;
	private int yearlyInvestmentUnder8oC;
	@Embedded
	private BankDetails bankDetail;
	@Embedded
	private Salary salary;
	
	
	
	public Associate(String firstName, String lastName, String department,
			String designation, String pancard, String emailId,
			int yearlyInvestmentUnder8oC, BankDetails bankDetail, Salary salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailId = emailId;
		this.yearlyInvestmentUnder8oC = yearlyInvestmentUnder8oC;
		this.bankDetail = bankDetail;
		this.salary = salary;
	}

	public Associate() {}
	
	public Associate(int associateID, int yearlyInvestmentUnder8oC,
			String firstName, String lastName, String department,
			String designation, String pancard, String emailId,
			BankDetails bankDetail, Salary salary) {
		super();
		this.associateID = associateID;
		this.yearlyInvestmentUnder8oC = yearlyInvestmentUnder8oC;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailId = emailId;
		this.bankDetail = bankDetail;
		this.salary = salary;
	}	
	
	public Associate(int yearlyInvestmentUnder8oC, String firstName,
			String lastName, String department, String designation,
			String pancard, String emailId, BankDetails bankDetail,
			Salary salary) {
		super();
		this.yearlyInvestmentUnder8oC = yearlyInvestmentUnder8oC;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailId = emailId;
		this.bankDetail = bankDetail;
		this.salary = salary;
	}

	public int getAssociateID() {
		return associateID;
	}

	public void setAssociateID(int associateID) {
		this.associateID = associateID;
	}

	public int getYearlyInvestmentUnder8oC() {
		return yearlyInvestmentUnder8oC;
	}

	public void setYearlyInvestmentUnder8oC(int yearlyInvestmentUnder8oC) {
		this.yearlyInvestmentUnder8oC = yearlyInvestmentUnder8oC;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public BankDetails getBankDetail() {
		return bankDetail;
	}

	public void setBankDetail(BankDetails bankDetail) {
		this.bankDetail = bankDetail;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Associate [associateID=" + associateID
				+ ", yearlyInvestmentUnder8oC=" + yearlyInvestmentUnder8oC
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", department=" + department + ", designation=" + designation
				+ ", pancard=" + pancard + ", emailId=" + emailId
				+ ", bankDetail=" + bankDetail.toString() + ", salary=" + salary.toString() + "]";
	}

	
}
