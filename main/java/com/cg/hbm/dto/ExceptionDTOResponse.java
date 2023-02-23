package com.cg.hbm.dto;

public class ExceptionDTOResponse {

	private String errorMsg;
	private String dateTime;
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public ExceptionDTOResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExceptionDTOResponse(String errorMsg, String dateTime) {
		super();
		this.errorMsg = errorMsg;
		this.dateTime = dateTime;
	}
}
