/**
 * Copyright Bo Software.
 */
package com.bosoftware.jsf.demo.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import com.bosoftware.jsf.demo.entity.User;
import com.bosoftware.jsf.demo.view.service.UserService;

/**
 * @author Bo Wang
 *
 *         7 Jul. 2018
 */
@ManagedBean
public class UserView {

	private List<User> userList;

	@ManagedProperty("#{userService}")
	private UserService userService;

	private User selectedUser;

	@PostConstruct
	public void init() {
		userList = userService.getUserList();

	}

	/**
	 * @return the selectedUser
	 */
	public User getSelectedUser() {
		return selectedUser;
	}

	/**
	 * @param selectedUser the selectedUser to set
	 */
	public void setSelectedUser(User selectedUser) {
		this.selectedUser = selectedUser;
	}

	/**
	 * @return the userList
	 */
	public List<User> getUserList() {
		return userList;
	}

	/**
	 * @param userList the userList to set
	 */
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	/**
	 * @return the userService
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * @param userService the userService to set
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void loadUserDetail(ActionEvent actionEvent) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "test", null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
}
