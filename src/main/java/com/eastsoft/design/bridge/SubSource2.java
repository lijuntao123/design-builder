package com.eastsoft.design.bridge;

import com.eastsoft.design.util.LogInfoUtil;

/**
 * SubSource2
 * @author ljt
 * @date 2015-5-5 08:29:20
 */
public class SubSource2 implements ISource {

	public void method1() {
		LogInfoUtil.print(SubSource2.class.getName(),"+++++++++{}","method1");

	}

}
