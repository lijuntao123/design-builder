package com.eastsoft.design.command;

/**
 * LightOnCommand
 * @author ljt
 * @date 2015年6月2日 上午8:17:25
 */
public class LightOnCommand implements Command {

	private Light light;
	
	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}

	public void execute() {
		light.on();

	}

}
