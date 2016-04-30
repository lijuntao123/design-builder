package com.eastsoft.design.observer.weatherdatademo;

/**
 * IWeatherData
 * @author ljt
 * @date 2015年5月12日 上午8:22:01
 */
public interface IObservable {
	public void registerObserver(IObserver observer);
	public void removeObserver(IObserver observer);
	public void notifyObserver();

}
