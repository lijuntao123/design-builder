package com.eastsoft.design.iterator;

/**
 * Iiterator
 * 
 * @author ljt
 * @date 2015年5月11日 下午2:39:24
 */
public interface Iiterator {
	public Object previous();

	public Object next();

	public Object first();

	public boolean hasNext();

}
