package com.eastsoft.design.factory.simplefactory;

import com.eastsoft.design.factory.Pizza;

/**
 * SimplePizzaFactory
 * @author ljt
 * @date 2015年5月16日 上午8:17:28
 */
public class SimplePizzaFactory {
	public Pizza createFizza(String type){
//		if("ny".equals(type)){
//			
//		}
		
		return new Pizza();
	}

}
