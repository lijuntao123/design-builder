package com.eastsoft.design.composite.menudemo;

/**
 * Waitress
 * @author ljt
 * @date 2015年8月5日 上午8:32:42
 */
public class Waitress {
	private IMenuComponent allMenu;

	public Waitress(IMenuComponent allMenu) {
		super();
		this.allMenu = allMenu;
	}
	
	public void print(){
		allMenu.print();
	}

}
