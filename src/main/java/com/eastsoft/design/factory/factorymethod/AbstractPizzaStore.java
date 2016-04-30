package com.eastsoft.design.factory.factorymethod;

import com.eastsoft.design.factory.Pizza;

/**
 * AbstractPizzaStore
 * @author ljt
 * @date 2015年5月21日 上午8:12:40
 */
public abstract class AbstractPizzaStore {

	public abstract Pizza createPizza(String type);
	
	public void orderPizza(String type){
		Pizza pizza=createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cute();
		pizza.box();
	}
}
