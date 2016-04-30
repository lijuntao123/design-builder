package com.eastsoft.design.composite.menudemo;
/**
 * 
 * MenuComponent
 * @author ljt
 * @date 2015年8月4日 上午8:15:26
 */
public abstract class MenuComponent implements IMenuComponent {

	public String getName() {
		throw new UnsupportedOperationException();
	}

	public String getDescription() {
		throw new UnsupportedOperationException();
	}

	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}

	public float getPrice() {
		throw new UnsupportedOperationException();
	}

	public void print() {
		throw new UnsupportedOperationException();

	}

	public void add(IMenuComponent mc) {
		throw new UnsupportedOperationException();

	}

	public void remove(IMenuComponent mc) {
		throw new UnsupportedOperationException();

	}

	public IMenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

}
