package com.bosoftware.jsf.demo.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bosoftware.jsf.demo.view.service.LoginService;

@ManagedBean
@SessionScoped
public class LoginBean {

	Logger logger = LoggerFactory.getLogger(getClass());
	private String userName;
	private String password;

	@ManagedProperty("#{loginService}")
	private LoginService loginService;

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

	/**
	 * @return the loginService
	 */
	public LoginService getLoginService() {
		return loginService;
	}

	/**
	 * @param loginService the loginService to set
	 */
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	public String validateUserLogin() {
		String navResult = "";
		logger.debug("Entered Username is= " + userName + ", password is= " + password);
		if (loginService.isLoginSuccess(userName, password)) {
			navResult = "success";
		} else {
			navResult = "failure";
		}
		return navResult;
	}
}