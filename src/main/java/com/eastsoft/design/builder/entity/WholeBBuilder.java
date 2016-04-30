package com.eastsoft.design.builder.entity;

import com.eastsoft.design.builder.interf.IBuilder;

/**
 * WholeBBuilder
 * 
 * @author ljt
 * @date 2015-4-11 08:07:45
 *
 */
public class WholeBBuilder implements IBuilder {

	private Whole whole=null;
	
	public WholeBBuilder(){
		whole=new Whole("+++++++wholeB");
	}

	public void buildPartA() {
		whole.partA=new PartAB("++++++PartAB");

	}

	public void buildPartB() {
		whole.partB=new PartBB("+++++++PartBB");

	}

	public void buildPartC() {
		whole.partC=new PartCB("+++++++PartCB");

	}

	public Whole getProductor() {
		buildPartA();
		buildPartB();
		buildPartC();
		return whole;
	}

}
