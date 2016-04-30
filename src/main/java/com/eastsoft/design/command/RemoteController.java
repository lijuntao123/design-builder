package com.eastsoft.design.command;

/**
 * RemoteController
 * 
 * @author ljt
 * @date 2015年6月2日 上午8:18:58
 */
public class RemoteController {

	private Command command;

	public void buttonPressed() {
		command.execute();
	}

	public void setCommand(Command command) {
		this.command = command;
	}

}
