package com.eastsoft.design.adapter.objadpter;

import com.eastsoft.design.adapter.ITarget;
import com.eastsoft.design.adapter.Source;

/**
 * ObjAddapter
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，
 * 而是持有Source类的实例，以达到解决兼容性的问题
 * 
 * @author ljt
 * @date 2015-4-30 08:02:40
 */
public class ObjAdapter implements ITarget {

	/**
	 * 对象适配器不同于类的适配器，对象适配器不在继承源类，而是持有源类的对象
	 */
	private Source source;

	public ObjAdapter(Source source) {
		super();
		this.source = source;
	}

	public void method1() {
		source.method1();

	}

	public void method2() {
		System.out.println("++++++++method2");

	}

}
