/**
 * 描述: 
 * BaseController.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 描述: 
 * 
 * @author qye.zheng
 * BaseController
 */
//@Controller
public abstract class BaseController {
	
	/* apache commons log */
	protected Log log = LogFactory.getLog(this.getClass().getName());
	
	
	/**
	 * 
	 * @description 
	 * @return
	 * @author qianye.zheng
	 */
	  @Bean
	   public RestTemplate restTemplate()
	  {
	      return new RestTemplate();
	   }
	
}
