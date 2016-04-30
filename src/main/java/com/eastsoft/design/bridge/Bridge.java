package com.eastsoft.design.bridge;

/**
 * Bridge
 * 
 * @author ljt
 * @date 2015年5月5日 上午8:31:40
 */
public abstract class Bridge {
	private ISource source = null;

	public void method1() {
		source.method1();
	}

	public ISource getSource() {
		return source;
	}

	public void setSource(ISource source) {
		this.source = source;
	}
	
	
}
