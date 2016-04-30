package com.eastsoft.design.iterator;

/**
 * MyIterator
 * 
 * @author ljt
 * @date 2015年5月11日 下午2:41:32
 */
public class MyIterator implements Iiterator {

	private IConnection connection;
	private int pos = -1;

	public MyIterator(IConnection connection) {
		super();
		this.connection = connection;
	}

	public Object previous() {
		if (pos > 0) {
			pos--;
		}
		return connection.get(pos);
	}

	public Object next() {
		if (pos < connection.size() - 1) {
			pos++;
		}
		return connection.get(pos);
	}

	public Object first() {
		pos=0;
		return connection.get(pos);
	}

	public boolean hasNext() {
		if (pos < connection.size() - 1) {
			return true;
		}
		return false;
	}

}
