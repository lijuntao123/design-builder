package com.eastsoft.design.proxy;

import com.eastsoft.design.util.LogInfoUtil;

/**
 * Source
 * @author ljt
 * @date 2015-5-4 16:37:27
 */
public class Source implements ISource{
	public void method1(){
		LogInfoUtil.print(Source.class.getName(),"++++++{}","method1");
	}

}
