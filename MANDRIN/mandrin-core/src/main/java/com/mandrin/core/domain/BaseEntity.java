package com.mandrin.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author HasankaMac
 *
 */
public class BaseEntity extends AbstractTrackableEntity implements Serializable{


	private static final long serialVersionUID = 1L;

	private Date createdDate;
	
	private Date lastModifieddate;

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastModifieddate() {
		return lastModifieddate;
	}

	public void setLastModifieddate(Date lastModifieddate) {
		this.lastModifieddate = lastModifieddate;
	}
	
}
