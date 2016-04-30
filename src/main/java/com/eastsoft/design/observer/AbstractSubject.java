package com.eastsoft.design.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * AbstractSubject
 * 
 * @author ljt
 * @date 2015年5月11日 下午1:47:19
 */
public abstract class AbstractSubject implements ISubject {

	Vector<IObserver> vectors = new Vector<IObserver>();

	public void add(IObserver observer) {
		vectors.add(observer);

	}

	public void del(IObserver observer) {
		vectors.remove(observer);

	}

	public void notifyChange() {
		Enumeration<IObserver> enums = vectors.elements();
		while (enums.hasMoreElements()) {
			enums.nextElement().update();
		}

	}

	public abstract void operate();

}
