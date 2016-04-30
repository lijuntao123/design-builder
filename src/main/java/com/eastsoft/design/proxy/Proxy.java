package com.eastsoft.design.proxy;

import com.eastsoft.design.util.LogInfoUtil;

/**
 * Proxy 使用代理模式，代理和真实对象之间的的关系通常在编译时就已经确定了，而装饰者能够在运行时递归地被构造。
 * 
 * @author ljt
 * @date 2015-5-4 16:56:10
 */
public class Proxy implements ISource {

	private Source source;

	public Proxy() {
		super();
		this.source = new Source();
	}

	public void method1() {
		LogInfoUtil.print(Proxy.class.getName(), "++++++{}", "proxy before");
		source.method1();
		LogInfoUtil.print(Proxy.class.getName(), "++++++{}", "proxy after");
	}
}
