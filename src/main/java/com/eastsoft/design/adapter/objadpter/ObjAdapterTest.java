package com.eastsoft.design.adapter.objadpter;

import com.eastsoft.design.adapter.ITarget;
import com.eastsoft.design.adapter.Source;

/**
 * ObjAdapterTest
 * @author ljt
 * @date 
 */
public class ObjAdapterTest {

	public static void main(String[] args) {
		ITarget adapter=new ObjAdapter(new Source());
		
		adapter.method1();
		adapter.method2();
	}
}
