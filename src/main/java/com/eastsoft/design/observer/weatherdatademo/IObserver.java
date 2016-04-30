package com.eastsoft.design.observer.weatherdatademo;

/**
 * IObserver
 * @author ljt
 * @date 2015年5月12日 上午8:24:12
 */
public interface IObserver {
	public void update(float temp,float humity,float pressure);

}
