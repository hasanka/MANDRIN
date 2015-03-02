package com.mandrin.core.dao;

import org.springframework.data.mongodb.core.MongoOperations;

import com.mandrin.api.exception.MandrinExceptionCode;
import com.mandrin.core.exception.MandrinDataAccessException;
import com.mandrin.api.exception.MandrinException;

/**
 * 
 * @author HasankaMac
 *
 */
public abstract class BaseMongoDao {

	private MongoOperations mongoOperation;

	protected void mandrinExceptionHandler(Exception e)throws MandrinException{
		throw new MandrinDataAccessException(MandrinExceptionCode.Database.DATA_ACCESS_EXCEPTION, e);
	}
	
	public MongoOperations getMongoOperation() {
		return mongoOperation;
	}

	public void setMongoOperation(MongoOperations mongoOperation) {
		this.mongoOperation = mongoOperation;
	}
	
}
