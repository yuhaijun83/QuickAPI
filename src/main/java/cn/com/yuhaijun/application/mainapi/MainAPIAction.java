/**
 * Copyright @ 2012-2022 yuhaijun.com.cn All Rights Reserved
 */
package cn.com.yuhaijun.application.mainapi;

import cn.com.yuhaijun.base.BaseAction;
import cn.com.yuhaijun.utils.JsonApiUtils;

/**
 * XXXXXXXX
 * 
 * @author Haijun
 */
public class MainAPIAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1339779603793830280L;
	
	/**
	 * 
	 * @return
	 */
	public String toMainAPI() {
		String strJsonData = JsonApiUtils.toJSONString("SampleAPI");
		
		this.setJsonData(strJsonData);
		
		return SUCCESS;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
