package com.eastsoft.design.builder.entity;

import com.eastsoft.design.builder.interf.IBuilder;

/**
 * WholeABuilder
 * 
 * @author ljt
 * @date 2015-4-10 08:51:00
 *
 */
public class WholeABuilder implements IBuilder {

	private Whole whole=null;
	
	public WholeABuilder(){
		whole=new Whole("+++++++wholeA");
	}

	public void buildPartA() {
		whole.partA=new PartAA("++++++PartAA");

	}

	public void buildPartB() {
		whole.partB=new PartBA("+++++++PartBA");

	}

	public void buildPartC() {
		whole.partC=new PartCA("+++++++PartCA");

	}

	public Whole getProductor() {
		buildPartA();
		buildPartB();
		buildPartC();
		return whole;
	}

}
