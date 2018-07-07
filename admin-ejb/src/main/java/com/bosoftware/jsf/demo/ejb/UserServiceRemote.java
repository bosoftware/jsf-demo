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
public interface UserServiceRemote {

	public List<User> getUsers();

	public boolean isLoginSucess(String loginId, String password);

}
