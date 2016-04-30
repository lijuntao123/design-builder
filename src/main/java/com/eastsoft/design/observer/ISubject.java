package com.eastsoft.design.observer;

/**
 * ISubject
 * @author ljt
 * @date 2015年5月11日 下午1:38:13
 */
public interface ISubject {
	public void add(IObserver observer);
	public void del(IObserver observer);
	public void notifyChange();

}
