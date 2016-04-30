package com.eastsoft.design.composite.menudemo;

/**
 * 
 * MenuComponent
 * @author ljt
 * @date 2015年8月4日 上午8:00:32
 */
public interface IMenuComponent {

	public String getName();
	public String getDescription();
	public boolean isVegetarian();
	public float getPrice();
	public void print();
	public void add(IMenuComponent mc);
	public void remove(IMenuComponent mc);
	public IMenuComponent getChild(int i);
}
