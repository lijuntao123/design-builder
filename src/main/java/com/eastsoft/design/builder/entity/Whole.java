package com.eastsoft.design.builder.entity;

import com.eastsoft.design.builder.interf.PartA;
import com.eastsoft.design.builder.interf.PartB;
import com.eastsoft.design.builder.interf.PartC;


/**
 * Whole
 * @author ljt
 * @date 2015-4-10 08:37:03
 *
 */
public class Whole {
	public PartA partA;
	public PartB partB;
	public PartC partC;
	
	public Whole(String arg){
		System.out.println("+++++++++builder whole: "+arg);
	}

}
