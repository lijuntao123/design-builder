package com.eastsoft.design.command;

import com.eastsoft.design.util.LogInfoUtil;

/**
 * Light
 * 
 * @author ljt
 * @date 2015年6月2日 上午8:15:02
 */
public class Light {
	public void on() {
		LogInfoUtil
				.print(Light.class.getCanonicalName(), "+++++{}", "light on");
	}

	public void off() {
		LogInfoUtil.print(Light.class.getCanonicalName(), "+++++{}",
				"light off");

	}

}
