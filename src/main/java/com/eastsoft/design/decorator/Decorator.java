package com.eastsoft.design.decorator;

import com.eastsoft.design.util.LogInfoUtil;

/**
 * Decorator
 * @author ljt
 * @date 
 */
public class Decorator implements ISource {

	private final String className=Decorator.class.getName();
	private ISource source;
	
	public Decorator(ISource source) {
		super();
		this.source = source;
	}

	public void method() {
		LogInfoUtil.print(className,"+++++{}","decorate before");
		source.method();
		LogInfoUtil.print(className,"+++++{}","decorate after");
	}

}
