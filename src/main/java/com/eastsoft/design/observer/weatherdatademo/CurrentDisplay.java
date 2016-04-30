package com.eastsoft.design.observer.weatherdatademo;

import com.eastsoft.design.util.LogInfoUtil;

/**
 * CurrentDisplay
 * 
 * @author ljt
 * @date 2015年5月12日 下午7:33:50
 */
public class CurrentDisplay implements IDisplay, IObserver {

	public CurrentDisplay(IObservable observerable) {
		super();
		observerable.registerObserver(this);;
	}

	public void update(float temp, float humity, float pressure) {
		display(temp, humity, pressure);

	}

	public void display(float temp, float humity, float pressure) {
		LogInfoUtil
				.print(CurrentDisplay.class.getName(),
						"display temp={},humity={},pressure={}", temp+"", humity+"",
						pressure+"");

	}

}
