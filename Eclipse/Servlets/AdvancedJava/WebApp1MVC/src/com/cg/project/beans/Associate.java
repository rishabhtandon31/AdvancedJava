package com.cg.project.beans;


public class Associate {
	private int associateId;
	private String password;
	
	private String firstName,lastName,department,designation,dob,username,gender,education,email,age,address,city,state,country,pincode;
	private String []hobbies;
	public Associate() {
		super();
	}
	public Associate(int associateId, String password) {
		super();
		this.associateId = associateId;
		this.password = password;
	}
	
	
	public Associate(int associateId, String password, String firstName,
			String lastName, String department, String designation, String dob,
			String username, String gender, String education, String email,
			String age, String address, String city, String state,
			String country, String pincode, String[] hobbies) {
		super();
		this.associateId = associateId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.dob = dob;
		this.username = username;
		this.gender = gender;
		this.education = education;
		this.email = email;
		this.age = age;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.setHobbies(hobbies);
	}
	/*public Associate(int associateId, String password, String firstName,
			String lastName, String department, String designation, String dob,
			String username, String gender, String education, String email,
			String age, String address, String city, String state,
			String country, String pincode) {
		super();
		this.associateId = associateId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.dob = dob;
		this.username = username;
		this.gender = gender;
		this.education = education;
		this.email = email;
		this.age = age;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}*/
	public int getAssociateId() {
		return associateId;
	}
	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Associate [associateId=" + associateId + ", password="
				+ password + "]";
	}
	public String [] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String [] hobbies) {
		this.hobbies = hobbies;
	}
	
}
