package com.eastsoft.design.strategy;

/**
 * Plus
 * 
 * @author ljt
 * @date 2015年5月8日 上午8:43:00
 */
public class Plus extends AbstractCalculator implements ICalculator {

	public int calculator(String statement) {
		int[] intArray = split(statement, "\\+");
		return intArray[0] + intArray[1];
	}

}
