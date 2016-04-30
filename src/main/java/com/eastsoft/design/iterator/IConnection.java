package com.eastsoft.design.iterator;


/**
 * Connection
 * 
 * @author ljt
 * @date 2015年5月11日 下午2:31:20
 */
public interface IConnection {
	public Iiterator iterator();

	public int size();

	public Object get(int i);

}
