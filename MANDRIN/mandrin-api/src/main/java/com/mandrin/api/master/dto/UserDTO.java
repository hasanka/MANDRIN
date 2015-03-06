package com.mandrin.api.master.dto;

import java.io.Serializable;

/**
 * 
 * @author HasankaMac
 *
 */
public class UserDTO implements Serializable   {

	private static final long serialVersionUID = 1L;
	
	private String userId;
	
	private String firstName;
	
	private String lastName;
	
	private long phoneNumber;
	
	private String email;
	
	private String status;
	
	private String userName;
	
	private String password;
	
	private String comment;

	private Integer version;
	
	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", status=" + status + ", userName="
				+ userName + ", password=" + password + ", comment=" + comment
				+ "]";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
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

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	
}
