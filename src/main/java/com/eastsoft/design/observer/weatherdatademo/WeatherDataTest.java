package com.eastsoft.design.observer.weatherdatademo;

/**
 * WeatherDataTest
 * @author ljt
 * @date 2015年5月12日 下午7:51:39
 */
public class WeatherDataTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData data=new WeatherData();		
		CurrentDisplay dis=new CurrentDisplay(data);
		data.setMeasureData(1.0f, 12, 67);
		

	}

}
