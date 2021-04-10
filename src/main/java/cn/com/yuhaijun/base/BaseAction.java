/**
 * Copyright @ 2012-2022 yuhaijun.com.cn All Rights Reserved
 */
package cn.com.yuhaijun.base;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

/**
 * XXXXXXXX
 * 
 * @author Haijun
 */
public class BaseAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6247990867448199236L;

	/**
	 * Json data 用 
	 */
	private String jsonData = "";
	public String getJsonData() {
		return jsonData;
	}
	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
	}
	
	/**
	 * Json data 用 
	 */
	private Map<String,Object> jsonDataMap;
	public Map<String, Object> getJsonDataMap() {
		return jsonDataMap;
	}
	public void setJsonDataMap(Map<String, Object> jsonDataMap) {
		this.jsonDataMap = jsonDataMap;
	}
}
