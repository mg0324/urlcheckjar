package org.mgang.urlcheck.vo;
/**
 * 
 * @author meigang 2014-11-4 8:46
 * 功能(权限)实体
 */
public class Function {
	/**
	 * 
	FieldTypeComment
	funIdint(11) NOT NULL
	funNamevarchar(32) NULL
	notevarchar(128) NULL
	resourcevarchar(64) NULL
	stuffixvarchar(8) NULL
	paramsvarchar(64) NULL
	 */
	private int funId;
	private String funName;
	/**
	 * note
	 * 功能（权限）描述
	 */
	private String note;
	/**
	 * resource
	 * 请求的资源
	 */
	private String resource;
	/**
	 * 请求资源的后缀，如.do
	 */
	private String stuffix;
	/**
	 * 请求的参数，多个参数以逗号间隔
	 */
	private String params;
	private int type;
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getFunId() {
		return funId;
	}
	public void setFunId(int funId) {
		this.funId = funId;
	}
	public String getFunName() {
		return funName;
	}
	public void setFunName(String funName) {
		this.funName = funName;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getResource() {
		return resource;
	}
	public void setResource(String resource) {
		this.resource = resource;
	}
	public String getStuffix() {
		return stuffix;
	}
	public void setStuffix(String stuffix) {
		this.stuffix = stuffix;
	}
	public String getParams() {
		return params;
	}
	public void setParams(String params) {
		this.params = params;
	}
	
	
}
