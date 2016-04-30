package com.eastsoft.design.observer;

import com.eastsoft.design.util.LogInfoUtil;

/**
 * Observer1
 * @author ljt
 * @date 2015年5月11日 下午1:11:55
 */
public class Observer1 implements IObserver {

	public void update() {
		LogInfoUtil.print(Observer1.class.getName(), "++++++observer1 has receiver {}", "update");

	}

}
