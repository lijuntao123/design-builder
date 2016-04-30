package com.eastsoft.design.composite.menudemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * Menu
 * 
 * @author ljt
 * @date 2015年8月4日 上午8:15:20
 */
public class Menu extends MenuComponent {
	private String name;
	private String description;
	private List<IMenuComponent> menuComponents = new ArrayList<IMenuComponent>();

	public Menu(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {

		return description;
	}

	@Override
	public void print() {
		String str="MenuName:"+name+"\ndescription:"+description+" ";
		System.out.println(str);
		Iterator<IMenuComponent> it=menuComponents.iterator();
		while(it.hasNext()){
			it.next().print();
		}
		
	}

	@Override
	public void add(IMenuComponent mc) {

		menuComponents.add(mc);
	}

	@Override
	public void remove(IMenuComponent mc) {

		menuComponents.remove(mc);
	}

	@Override
	public IMenuComponent getChild(int i) {

		return menuComponents.get(i);
	}

}
