package com.eastsoft.design.factory.simplefactory;

import com.eastsoft.design.factory.Pizza;

/**
 * PizzaStore
 * 
 * @author ljt
 * @date 2015年5月16日 上午8:23:10
 */
public class PizzaStore {
	private SimplePizzaFactory simplePizzaFactory;

	public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
		super();
		this.simplePizzaFactory = simplePizzaFactory;
	}

	public void orderPizza(String type) {
		Pizza pizza = simplePizzaFactory.createFizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cute();
		pizza.box();
	}

}
