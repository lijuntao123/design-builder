package com.eastsoft.design.adapter.classadapter;

import com.eastsoft.design.adapter.ITarget;

/**
 * AdpterTest
 * @author ljt
 * @date 2015-4-29 08:32:32
 */
public class AdapterTest {
	public static void main(String[] args) {
		ITarget target=new Adapter();
		
		target.method1();
		target.method2();
	}
}
