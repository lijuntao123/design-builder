package com.eastsoft.design.adapter.interfaceadapter;

import com.eastsoft.design.adapter.ITarget;

/**
 * Wrapper
 * 接口的适配器，接口中有多个方法，但是实际使时只需要其中的某几个，又不想实现所有的方法，
 * 为此，可写一个抽象类来实现该接口，并实现所有的方法，在实际使用时，只需继承该抽象类，
 * 并重写需要的方法即可
 * @author ljt
 * @date 2015-4-30 08:21:26
 */
public abstract class Wrapper implements ITarget {

	public void method1() {
		// TODO Auto-generated method stub

	}

	public void method2() {
		// TODO Auto-generated method stub

	}

}
