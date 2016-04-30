package com.eastsoft.design.chainofresponsibility;

import com.eastsoft.design.util.LogInfoUtil;

/**
 * MyHandler
 * @author ljt
 * @date 2015年5月11日 下午4:47:13
 */
public class MyHandler extends AbstractHandler implements IHandler {

	private String name;
	
	public MyHandler(String name) {
		super();
		this.name = name;
	}

	public void operate() {
		LogInfoUtil.print(MyHandler.class.getName(),"++++{} operate",name);
		if(getHandler()!=null){
			getHandler().operate();
		}

	}

}
