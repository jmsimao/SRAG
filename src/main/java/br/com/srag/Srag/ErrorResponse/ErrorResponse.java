package br.com.srag.Srag.ErrorResponse;

public class ErrorResponse {
	
	private int httpErrorValue;
	private String httpErrorDesc;
	private String mensagem;
	private String errorInfo;
	private String className;
	
	public ErrorResponse(int httpErrorValue, String httpErrorDesc,
						String mensagem, String errorInfo, 
						String className) {
		this.httpErrorValue = httpErrorValue;
		this.httpErrorDesc = httpErrorDesc;
		this.mensagem = mensagem;
		this.errorInfo = errorInfo;
		this.className = className;
	}

	public int getHttpErrorValue() {
		return httpErrorValue;
	}

	public String getHttpErrorDesc() {
		return httpErrorDesc;
	}

	public String getErrorInfo() {
		return errorInfo;
	}

	public String getClassName() {
		return className;
	}

	public String getMensagem() {
		return mensagem;
	}

}
