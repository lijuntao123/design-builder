package com.eastsoft.design.composite.menudemo;

/**
 * MenuComponentTest
 * @author ljt
 * @date 2015年8月5日 上午8:21:40
 */
public class MenuComponentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IMenuComponent dinner1Menu=new Menu("dinner1", "dinner1 menu");
		IMenuComponent dinner2Menu=new Menu("dinner2", "dinner2 menu");
		IMenuComponent dinner3Menu=new Menu("dinner3", "dinner3 menu");
		
		IMenuComponent allMenu=new Menu("allnume", "all menu");
		allMenu.add(dinner1Menu);
		allMenu.add(dinner2Menu);
		allMenu.add(dinner3Menu);
		
		dinner1Menu.add(new MenuItem("bread", "bread desc", 1.6f, true));
		dinner2Menu.add(new MenuItem("caffoe", "caffoe desc", 1.9f, false));
		dinner3Menu.add(new MenuItem("milk", "milk desc", 1.9f, false));
		dinner3Menu.add(dinner1Menu);
		
		Waitress waitress=new Waitress(allMenu);
		waitress.print();

	}

}
