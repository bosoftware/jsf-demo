/**
 * Copyright Bo Software.
 */
package com.bosoftware.jsf.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author Bo Wang
 *
 *         6 Jul. 2018
 */
@Entity
@Table(name = "user")
@NamedQueries({ @NamedQuery(name = User.QUERY_FINDALL, query = "SELECT u FROM User u"),
		@NamedQuery(name = User.QUERY_FIND_LOGINID_PASSWORD, query = "SELECT u FROM User u where u.userId=:userId and u.password=:password") })
public class User extends AbstractEntity {

	public static final String QUERY_FINDALL = "User.findAll";
	public static final String QUERY_FIND_LOGINID_PASSWORD = "User.findByLoginIdAndPassword";
	/**
	 * 
	 */
	private static final long serialVersionUID = 8073321111603410590L;

	@Column(name = "user_id", nullable = false)
	private String userId;

	@Column(name = "user_name", nullable = false)
	private String userName;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "email")
	private String emailAddress;

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
