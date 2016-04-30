package com.eastsoft.design.factory.simplefactory;


/**
 * FactoryTest
 * 
 * @author ljt
 * @date 2015年5月16日 上午10:31:39
 */
public class FactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaStore ps = new PizzaStore(new SimplePizzaFactory());
		ps.orderPizza("");

	}

}
