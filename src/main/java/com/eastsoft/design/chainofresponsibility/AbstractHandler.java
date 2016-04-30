package com.eastsoft.design.chainofresponsibility;

/**
 * AbstractHandler
 * @author ljt
 * @date 2015年5月11日 下午4:45:53
 */
public abstract class AbstractHandler {

	private IHandler handler;

	public IHandler getHandler() {
		return handler;
	}

	public void setHandler(IHandler handler) {
		this.handler = handler;
	}
	
	
}
