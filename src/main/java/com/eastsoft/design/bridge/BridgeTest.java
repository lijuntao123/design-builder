package com.eastsoft.design.bridge;

/**
 * BridgeTest
 * @author ljt
 * @date 2015年5月5日 下午1:24:20
 */
public class BridgeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bridge bridge=new MyBridge();
		
		bridge.setSource(new SubSource1());		
		bridge.method1();
		
		bridge.setSource(new SubSource2());		
		bridge.method1();
		
		

	}

}
