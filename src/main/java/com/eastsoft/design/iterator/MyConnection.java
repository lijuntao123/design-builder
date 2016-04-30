package com.eastsoft.design.iterator;


/**
 * MyConnection
 * 
 * @author ljt
 * @date 2015年5月11日 下午2:35:16
 */
public class MyConnection implements IConnection {

	Object[] objs = new Object[] { "A", "B", "C", "D", "E" };

	public Iiterator iterator() {
		// TODO Auto-generated method stub
		return new MyIterator(this);
	}

	public int size() {
		// TODO Auto-generated method stub
		return objs.length;
	}

	public Object get(int i) {
		return objs[i];
	}

}
