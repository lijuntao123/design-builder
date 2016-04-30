package com.eastsoft.design.observer;

/**
 * Subject1
 * @author ljt
 * @date 2015年5月11日 下午2:00:36
 */
public class Subject1 extends AbstractSubject {

	@Override
	public void operate() {
		notifyChange();

	}

}
