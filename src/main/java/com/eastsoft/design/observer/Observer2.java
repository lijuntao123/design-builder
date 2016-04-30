package com.eastsoft.design.observer;

import com.eastsoft.design.util.LogInfoUtil;

/**
 * Observer2
 * @author ljt
 * @date 2015年5月11日 下午1:35:35
 */
public class Observer2 implements IObserver {

	public void update() {
		LogInfoUtil.print(Observer2.class.getName(), "++++++observer2 has receiver {}", "update");

	}

}
