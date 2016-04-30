package com.eastsoft.design.strategy;

/**
 * 策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户。需要设计一个接口，为一系列实现类提供统一的方法，
 * 多个实现类实现该接口，设计一个抽象类（可有可无，属于辅助类），提供辅助函数
 * 
 * @author ljt
 * @date 2015年5月8日 上午8:45:13
 */
public class StrategyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ICalculator calc = new Plus();
		int result = calc.calculator("1+2");
	}

}
