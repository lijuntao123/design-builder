package com.eastsoft.design.observer.weatherdatademo;

import java.util.Vector;

/**
 * WeatherData
 * 
 * @author ljt
 * @date 2015年5月12日 上午8:25:48
 */
public class WeatherData implements IObservable {

	private Vector<IObserver> observers = null;
	private float temp;
	private float humity;
	private float pressure;

	public WeatherData() {
		super();
		this.observers = new Vector<IObserver>();
	}

	public void registerObserver(IObserver observer) {
		observers.add(observer);

	}

	public void removeObserver(IObserver observer) {
		observers.remove(observer);

	}

	public void notifyObserver() {
		for (IObserver o : observers) {
			o.update(temp, humity, pressure);
		}

	}
	
	public void measureChanged(){
		notifyObserver();
	}

	public void setMeasureData(float temp, float humity, float pressure) {
		this.temp=temp;
		this.humity=humity;
		this.pressure=pressure;
		measureChanged();
	}

	// private float getTemp(){};
	// private float getHumity(){};
	// private float getPressure(){};

}
