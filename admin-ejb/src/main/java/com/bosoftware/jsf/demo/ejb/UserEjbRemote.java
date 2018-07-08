/**
 * Copyright Bo Software.
 */
package com.bosoftware.jsf.demo.ejb;

import java.util.List;

import javax.ejb.Remote;

import com.bosoftware.jsf.demo.entity.User;

/**
 * @author Bo Wang
 *
 *         6 Jul. 2018
 */

@Remote
public interface UserEjbRemote {

	public List<User> getUsers();

	public boolean isLoginSucess(String loginId, String password);
	
	public User findUserById(int userId);

}
