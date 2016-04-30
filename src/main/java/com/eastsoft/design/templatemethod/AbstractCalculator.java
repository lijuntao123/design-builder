package com.eastsoft.design.templatemethod;

/**
 * 模板方法模式，就是指：一个抽象类中，有一个主方法，再定义1...n个方法，
 * 可以是抽象的，也可以是实际的方法，定义一个类，继承该抽象类，重写抽象方法，
 * 通过调用抽象类，实现对子类的调用
 * 
 * @author ljt
 * @date 2015年5月11日 上午11:14:24
 */
public abstract class AbstractCalculator {

	public final int calculate(String express, String opt) {
		int[] intArray = split(express, opt);
		return calculate(intArray[0], intArray[1]);
	}

	abstract public int calculate(int arg1, int arg2);

	private int[] split(String statement, String split) {
		String[] str = statement.split(split);
		int[] intArray = new int[2];
		intArray[0] = Integer.parseInt(str[0]);
		intArray[1] = Integer.parseInt(str[1]);
		return intArray;
	}
}
