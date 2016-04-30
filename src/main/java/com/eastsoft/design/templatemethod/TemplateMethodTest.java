package com.eastsoft.design.templatemethod;

import java.util.Collections;

/**
 * TemplateMethodTest
 * @author ljt
 * @date 2015年5月11日 上午11:22:13
 */
public class TemplateMethodTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractCalculator ac=new Plus();
		int re=ac.calculate("1+2", "\\+");
//		Collections.sort(list);
		

	}

}
