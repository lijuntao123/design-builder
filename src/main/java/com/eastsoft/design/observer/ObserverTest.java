package com.eastsoft.design.observer;

/**
 * ObserverTest
 * @author ljt
 * @date 2015年5月11日 下午2:01:25
 */
public class ObserverTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractSubject subject=new Subject1();
		subject.add(new Observer1());
		subject.add(new Observer2());
		
		subject.operate();

	}

}
