/**
 * Copyright @ 2012-2022 yuhaijun.com.cn All Rights Reserved
 */
package cn.com.yuhaijun.application.runapi;

import cn.com.yuhaijun.base.BaseAction;
import cn.com.yuhaijun.utils.JsonApiUtils;

/**
 * XXXXXXXX
 * 
 * @author Haijun
 */
public class RunAPIAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8814996632729945359L;
	
	/**
	 * 
	 * @return
	 */
	public String runAPI_001() {
		String strJsonData = JsonApiUtils.toJSONString("runAPI_001");
		
		this.setJsonData(strJsonData);
		
		return SUCCESS;
	}
	
	/**
	 * 
	 * @return
	 */
	public String runAPI_002() {
		String strJsonData = JsonApiUtils.toJSONString("runAPI_002");
		
		this.setJsonData(strJsonData);
		
		return SUCCESS;
	}
	
	/**
	 * 
	 * @return
	 */
	public String runAPI_003() {
		String strJsonData = JsonApiUtils.toJSONString("runAPI_003");
		
		this.setJsonData(strJsonData);
		
		return SUCCESS;
	}
	
	/**
	 * 
	 * @return
	 */
	public String runAPI_004() {
		String strJsonData = JsonApiUtils.toJSONString("runAPI_004");
		
		this.setJsonData(strJsonData);
		
		return SUCCESS;
	}
	
	/**
	 * 
	 * @return
	 */
	public String runAPI_005() {
		String strJsonData = JsonApiUtils.toJSONString("runAPI_005");
		
		this.setJsonData(strJsonData);
		
		return SUCCESS;
	}

}
