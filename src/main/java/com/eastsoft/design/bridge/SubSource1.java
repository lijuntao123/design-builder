package com.eastsoft.design.bridge;

import com.eastsoft.design.util.LogInfoUtil;

/**
 * SubSource1
 * @author ljt
 * @date 2015-5-5 08:28:20
 */
public class SubSource1 implements ISource {

	public void method1() {
		LogInfoUtil.print(SubSource1.class.getName(),"+++++++++{}","method1");

	}

}
