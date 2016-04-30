package com.eastsoft.design.adapter.interfaceadapter;

import com.eastsoft.design.adapter.ITarget;

/**
 * InterfaceAdapterTest
 * @author ljt
 * @date 
 */
public class InterfaceAdapterTest {

	public static void main(String[] args) {

		ITarget target=new SubWrapper1();
		target.method1();
		
		target=new SubWrapper2();
		target.method2();
	}

}
