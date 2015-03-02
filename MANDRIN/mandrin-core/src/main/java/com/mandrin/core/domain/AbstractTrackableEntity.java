package com.mandrin.core.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Version;


/**
 * 
 * @author HasankaMac
 *
 */
public class AbstractTrackableEntity implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Version
	private Integer version;

	public long getVersion() {
		return version;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	
	
}
