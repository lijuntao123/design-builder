package com.eastsoft.design.mytest;

/**
 * Coffee
 * 
 * @author ljt
 * @date 2015年7月12日 上午9:57:10
 */
public class Coffee extends MyBase {

	@Override
	public void prepareRecipe() {
		boilWater();
		brewCoffeeGrind();
		putInCup();
		addSugerAndMilk();

	}

	public void brewCoffeeGrind() {
		System.out.println("+++++++brewCoffeeGrind");
	}

	public void addSugerAndMilk() {
		System.out.println("++++++++++add suger and milk");
	}

	public static void main(String[] args) {
		MyBase coffee=new Coffee();
		coffee.prepareRecipe();
	}

}
