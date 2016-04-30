package com.eastsoft.design.factory.factorymethod;

import com.eastsoft.design.factory.Pizza;

/**
 * NYPizzaStore
 * @author ljt
 * @date 2015年5月21日 上午8:16:56
 */
public class NYPizzaStore extends AbstractPizzaStore {

	@Override
	public Pizza createPizza(String type) {
		
		if(type.equals("cheesse")){
			return new Pizza();
		}
		return null;
	}

}
