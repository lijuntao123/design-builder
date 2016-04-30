package com.eastsoft.design.builder.entity;

import com.eastsoft.design.builder.interf.IBuilder;

/**
 * Director
 * @author ljt
 * @date 2015-4-11 08:09:04
 *
 */
public class Director {

	private IBuilder builder;

	public Director(IBuilder builder) {
		super();
		this.builder = builder;
	}
	
	public Whole construct(){
		return builder.getProductor();
	}
}
