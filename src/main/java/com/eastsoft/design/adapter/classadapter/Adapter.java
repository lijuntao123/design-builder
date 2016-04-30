package com.eastsoft.design.adapter.classadapter;

import com.eastsoft.design.adapter.ITarget;
import com.eastsoft.design.adapter.Source;

/**
 * Adapter 核心思想就是：有一个Source类，拥有一个方法，待适配，目标接口时Targetable，通过Adapter类，
 * 将Source的功能扩展到Targetable里
 * 
 * @author ljt
 * @date 2015-4-18 08:29:59
 */
public class Adapter extends Source implements ITarget {

	public void method2() {
		System.out.println("++++++++++target method2()");

	}

}
