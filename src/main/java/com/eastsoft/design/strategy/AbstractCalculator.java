package com.eastsoft.design.strategy;

/**
 * AbstractCalculator
 * @author ljt
 * @date 2015年5月8日 上午8:34:12
 */
public abstract class AbstractCalculator {

	public int[] split(String statement,String split) {
		String[] str=statement.split(split);
		int[] intArray=new int[2];
		intArray[0]=Integer.parseInt(str[0]);
		intArray[1]=Integer.parseInt(str[1]);
		return intArray;
	}
}
