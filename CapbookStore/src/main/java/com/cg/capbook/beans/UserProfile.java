package com.cg.capbook.beans;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.ColumnTransformer;

@Entity
public class UserProfile {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String firstName;
	private String lastName;
	private String dob;
	private long mobileNo;
	private String gender;
	private String emailId;
	private String password1;
	private String password2;
	/*
	 * @Embedded private Address address;
	 */

	public UserProfile() {}


	public UserProfile(String firstName, String lastName, String dob, long mobileNo, String gender, String emailId,String password1, String password2) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.emailId = emailId;
		this.password1 = password1;
		this.password2 = password2;
	}



	public UserProfile(int userId, String firstName, String lastName, String dob, long mobileNo, String gender,
			String emailId, String password1, String password2) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.emailId = emailId;
		this.password1 = password1;
		this.password2 = password2;
	}


	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/*
	 * public Address getAddress() { return address; } public void
	 * setAddress(Address address) { this.address = address; }
	 */


	public String getPassword1() {
		return password1;
	}


	public void setPassword1(String password1) {
		this.password1 = password1;
	}


	public String getPassword2() {
		return password2;
	}


	public void setPassword2(String password2) {
		this.password2 = password2;
	}


	@Override
	public String toString() {
		return "UserProfile [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", mobileNo=" + mobileNo + ", gender=" + gender + ", emailId=" + emailId + ", password1=" + password1
				+ ", password2=" + password2 + "]";
	}


}
