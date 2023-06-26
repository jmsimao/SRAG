package br.com.srag.Srag.ErrorResponse;

public class NotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorInfo;
	
	public NotFoundException(String message, String errorInfo) {
		super(message);
		this.errorInfo = errorInfo;
	}
	
	public String getErrorInfo() {
		return this.errorInfo;
	}
	
}
