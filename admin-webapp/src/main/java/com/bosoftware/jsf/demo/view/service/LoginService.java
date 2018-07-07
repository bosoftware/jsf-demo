/**
 * Copyright Bo Software.
 */
package com.bosoftware.jsf.demo.view.service;

import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.bosoftware.jsf.demo.ejb.UserServiceRemote;

/**
 * @author Bo Wang
 *
 *         7 Jul. 2018
 */

@ManagedBean(name = "loginService", eager = true)
@ApplicationScoped
public class LoginService {

	@EJB
	UserServiceRemote userServiceRemote;

	public boolean isLoginSuccess(String loginId, String password) {
		return userServiceRemote.isLoginSucess(loginId, password);
	}
}
