package com.eastsoft.design.command;

/**
 * RemoteControllerTest
 * @author ljt
 * @date 2015年6月2日 上午8:20:31
 */
public class RemoteControllerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RemoteController rc=new RemoteController();
		
		LightOnCommand cmd=new LightOnCommand(new Light());
		
		rc.setCommand(cmd);
		rc.buttonPressed();

	}

}
