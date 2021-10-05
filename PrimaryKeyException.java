package com.hibernate.source;

public class PrimaryKeyException extends RuntimeException{
	String msg;

	public PrimaryKeyException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return this.msg;
	}
	
	
	
	

}
