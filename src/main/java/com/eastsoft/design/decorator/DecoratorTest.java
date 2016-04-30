package com.eastsoft.design.decorator;

/**
 * DecorateTest
 * @author ljt
 * @date 2015-5-4 08:15:56
 */
public class DecoratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ISource source=new Decorator(new Source());
		source.method();
	}

}
