package com.eastsoft.design.mytest;

/**
 * MyBase
 * 
 * @author ljt
 * @date 2015年7月12日 上午9:55:10
 */
public abstract class MyBase {

	public abstract void prepareRecipe();
	
	public void boilWater() {
		System.out.println("+++++++boilWadter");
	}

	public void putInCup() {
		System.out.println("++++++++ putInCup");
	}
}
