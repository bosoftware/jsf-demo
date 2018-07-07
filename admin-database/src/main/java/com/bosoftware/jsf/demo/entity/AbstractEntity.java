/**
 * Copyright Bo Software.
 */
package com.bosoftware.jsf.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Bo Wang
 *
 *         6 Jul. 2018
 */
@MappedSuperclass
public class AbstractEntity extends AbstractBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8454030514645237941L;

	@Column(name = "create_date_time")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date createDateTime;

	@Column(name = "update_date_time")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date updateDateTime;

	/**
	 * @return the createDateTime
	 */
	public Date getCreateDateTime() {
		return createDateTime;
	}

	/**
	 * @param createDateTime the createDateTime to set
	 */
	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	/**
	 * @return the updateDateTime
	 */
	public Date getUpdateDateTime() {
		return updateDateTime;
	}

	/**
	 * @param updateDateTime the updateDateTime to set
	 */
	public void setUpdateDateTime(Date updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

}
