package com.eastsoft.design.composite.menudemo;

/**
 * MenuItem
 * 
 * @author ljt
 * @date 2015年8月4日 上午8:28:02
 */
public class MenuItem extends MenuComponent {
	private String name;
	private String description;
	private float price;
	private boolean vegetarian;

	public MenuItem(String name, String description, float price,
			boolean vegetarian) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.vegetarian = vegetarian;
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
	public boolean isVegetarian() {

		return vegetarian;
	}

	@Override
	public float getPrice() {

		return price;
	}

	@Override
	public void print() {
        String str="menuItem name:"+name+"\n description:"+description
        		+"\n price:"+price+"\n vegetarian:"+(vegetarian?"yes":"no");
        System.out.println(str);
	}

}
