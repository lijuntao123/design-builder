package com.eastsoft.design.factory;

import com.eastsoft.design.util.LogInfoUtil;

/**
 * Pizza
 * 
 * @author ljt
 * @date 2015年5月16日 上午8:18:40
 */
public class Pizza {
	LogInfoUtil LOGGER = LogInfoUtil.getLogInfoUtil(Pizza.class.getName());

	public void prepare() {
		LOGGER.info("++++++{}", "prepare");
	}

	public void bake() {
		LOGGER.info("++++++{}", "bake");
	}

	public void cute() {
		LOGGER.info("++++++{}", "cute");
	}

	public void box() {
		LOGGER.info("++++++{}", "box");
	}

}
