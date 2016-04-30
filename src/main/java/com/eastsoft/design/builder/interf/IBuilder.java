package com.eastsoft.design.builder.interf;

import com.eastsoft.design.builder.entity.Whole;

/**
 * IBuilder
 * 
 * @author ljt
 * @date 2015-4-10 08:27:57
 *
 */
public interface IBuilder {
	public void buildPartA();

	public void buildPartB();

	public void buildPartC();

	public Whole getProductor();

}
