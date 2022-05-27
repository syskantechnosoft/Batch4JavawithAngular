package com.revature.model;

public class ErrorDetail {
	private boolean status;
	private String errorMessage;

	public ErrorDetail(boolean status, String errorMessage) {
		super();
		this.status = status;
		this.errorMessage = errorMessage;
	}

	public ErrorDetail() {
		super();
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
