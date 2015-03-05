package com.mandrin.controller.user.dto;

import java.io.Serializable;

/**
 * 
 * @author HasankaMac
 *
 */
public class UserFeto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long userId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String status;
	private String userName;
	private String comment;
	private String passwordCharCount;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
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
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getPasswordCharCount() {
		return passwordCharCount;
	}
	public void setPasswordCharCount(String passwordCharCount) {
		this.passwordCharCount = passwordCharCount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
